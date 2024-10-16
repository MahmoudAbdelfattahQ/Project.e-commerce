package com.InternProjects.e_commerce.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class CartNotFoundException extends RuntimeException {

    private  final int errorCode = 2001;
    private   String errorMessage = "Cart not found";
    public CartNotFoundException() {
        super();
    }

    public CartNotFoundException(String message) {
        super(message);
        errorMessage = message;
    }
}
