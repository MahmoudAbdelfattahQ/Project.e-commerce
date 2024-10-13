package com.InternProjects.e_commerce.exceptions;

import lombok.Getter;

@Getter
public class UserNotFoundException extends RuntimeException {

    private final int errorCode = 1000;
    private final String errorMessage = "User not found";
    public UserNotFoundException() {
        super();
    }

}
