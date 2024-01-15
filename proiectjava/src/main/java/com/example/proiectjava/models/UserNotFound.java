package com.example.proiectjava.models;

public class UserNotFound extends RuntimeException {

    public UserNotFound(Long id) {
        super("Could not find user " + id);
    }
}