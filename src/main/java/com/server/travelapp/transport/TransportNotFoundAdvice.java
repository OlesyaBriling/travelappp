package com.server.travelapp.transport;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TransportNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(TransportNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String transportNotFoundHandler(TransportNotFoundException ex) {
        return ex.getMessage();
    }
}
