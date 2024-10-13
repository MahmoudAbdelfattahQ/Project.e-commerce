package com.InternProjects.e_commerce.exceptions;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleNotFoundExceptions(UserNotFoundException ex) {
                ErrorResponse error = new ErrorResponse();
                error.setCode(ex.getErrorCode());
                error.setMessage(ex.getErrorMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
