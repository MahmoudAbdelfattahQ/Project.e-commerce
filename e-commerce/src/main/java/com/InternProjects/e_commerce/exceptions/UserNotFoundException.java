package com.InternProjects.e_commerce.exceptions;

import lombok.Getter;

@Getter
public class UserNotFoundException extends RuntimeException {

    private final int errorCode = 1000;
    private  String errorMessage ;


    public UserNotFoundException() {
        super();
    }
public UserNotFoundException(String message) {
        super(message);
        errorMessage = message;
}

}
