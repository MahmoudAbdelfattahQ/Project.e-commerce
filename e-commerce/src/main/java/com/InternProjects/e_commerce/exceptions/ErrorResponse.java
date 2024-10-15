package com.InternProjects.e_commerce.exceptions;

import lombok.Data;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Data
public class ErrorResponse {

    private String message;
    private int code;
    private String details;
    private LocalDateTime localDateTime;

}
