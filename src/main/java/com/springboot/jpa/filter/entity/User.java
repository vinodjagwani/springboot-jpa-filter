package com.springboot.jpa.filter.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

@Entity
@Setter
@Getter
@Table(name = "users")
@Filter(name = "statusFilter", condition = "status = :status")
@FilterDef(name = "statusFilter", parameters = @ParamDef(name = "status", type = String.class))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String status;


}
