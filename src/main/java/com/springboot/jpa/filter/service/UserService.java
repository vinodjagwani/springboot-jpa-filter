package com.springboot.jpa.filter.service;

import com.springboot.jpa.filter.entity.User;
import com.springboot.jpa.filter.repository.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UserService {

    EntityManager entityManager;

    UserRepository userRepository;

    @Transactional
    public List<User> getUsersByStatus(final String status) {
        final Session session = entityManager.unwrap(Session.class);
        session.enableFilter("statusFilter").setParameter("status", status);
        final List<User> users = userRepository.findAll();
        session.disableFilter("statusFilter");
        return users;
    }
}
