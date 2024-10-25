package com.InternProjects.e_commerce.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundExceptions(UserNotFoundException ex) {

            log.info("Not Found Exception Code : {} , Massage : {}", ex.getErrorCode() , ex.getMessage());
                ErrorResponse error = new ErrorResponse();
                error.setCode(ex.getErrorCode());
                error.setMessage(ex.getErrorMessage());
                error.setDetails("This user doesn't exist in the database");
                error.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(UserIsExistException.class)
    public ResponseEntity<ErrorResponse> handleIsExistExceptions(UserIsExistException ex) {

        log.info("This User is already exist Code : {} , Massage : {}",ex.getErrorCode() , ex.getMessage());

        ErrorResponse error = new ErrorResponse();
        error.setCode(ex.getErrorCode());
        error.setMessage(ex.getErrorMessage());
        error.setDetails("This email is already exist in the database");
        error.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);

    }

    @ExceptionHandler(CartDoseExistException.class)
    public ResponseEntity<ErrorResponse> handleCartDoseExistExceptions(CartDoseExistException ex) {
        log.info("This cart is already exist Code : {} , Massage : {}",ex.getErrorCode() , ex.getMessage());
        ErrorResponse error = new ErrorResponse();
        error.setCode(ex.getErrorCode());
        error.setMessage(ex.getErrorMessage());
        error.setDetails("This cart is already exist in the database");
        error.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(CartNotFoundException.class)
    public ResponseEntity<ErrorResponse>  handleCartNotFoundExceptions(CartNotFoundException ex) {
        log.info("The cart which send to updated is not found in the database");
        ErrorResponse error = new ErrorResponse();
        error.setLocalDateTime(LocalDateTime.now());
        error.setCode(ex.getErrorCode());
        error.setMessage(ex.getErrorMessage());
        error.setDetails("The cart which send to updated is not found in the database");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
