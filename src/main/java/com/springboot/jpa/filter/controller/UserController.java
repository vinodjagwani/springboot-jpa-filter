package com.springboot.jpa.filter.controller;

import com.springboot.jpa.filter.entity.User;
import com.springboot.jpa.filter.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UserController {

    UserService userService;

    @GetMapping("/status/{status}")
    public List<User> getUsersByStatus(@PathVariable final String status) {
        return userService.getUsersByStatus(status);
    }
}