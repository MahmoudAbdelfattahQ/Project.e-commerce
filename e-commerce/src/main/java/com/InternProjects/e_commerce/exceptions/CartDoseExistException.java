package com.InternProjects.e_commerce.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@EqualsAndHashCode(callSuper= true)
public class CartDoseExistException extends RuntimeException {
    private final Integer errorCode = 2000;
    private final String errorMessage = "Cart Dose Exist";
    public CartDoseExistException() {
        super();
    }
}
