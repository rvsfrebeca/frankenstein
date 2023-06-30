package com.ferreira.rebeca.frankinstain.main.exception;

import com.ferreira.rebeca.frankinstain.people.exception.RetrievePeopleException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(RetrievePeopleException.class)
    public ResponseEntity<Object> retrievePeopleException(RetrievePeopleException retrievePeopleException){
        return new ResponseEntity<>(retrievePeopleException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
