package com.InternProjects.e_commerce.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserIsExistException  extends RuntimeException{

    private final int errorCode = 1000;
    private  String errorMessage ;

    public UserIsExistException(String message ){
        super(message);
        errorMessage = message;


    }

}
