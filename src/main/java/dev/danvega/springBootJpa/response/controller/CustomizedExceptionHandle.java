package dev.danvega.springBootJpa.response.controller;

import dev.danvega.springBootJpa.response.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CustomizedExceptionHandle extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handleExceptions(UserNotFoundException exception, WebRequest webRequest){
        ExceptionRespone response = new ExceptionRespone();
        response.setMessage("Not Found");
        response.setDateTime(LocalDateTime.now());
        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return entity;
    }
}
