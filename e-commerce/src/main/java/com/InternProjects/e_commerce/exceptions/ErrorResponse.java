package com.InternProjects.e_commerce.exceptions;

import lombok.Data;

@Data
public class ErrorResponse {

    private String message;
    private int code;
}
