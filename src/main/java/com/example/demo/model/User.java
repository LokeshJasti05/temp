package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    public Object getPassword() {
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }

    // Getters and Setters
    // Constructors
}
