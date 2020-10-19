package com.spring.api.rest.connection.Controller;

public class UserNotFoundException extends RuntimeException {
    UserNotFoundException(int id) {
        super("Could not find user " + id);
    }
}
