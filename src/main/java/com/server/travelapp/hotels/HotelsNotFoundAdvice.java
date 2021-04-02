package com.server.travelapp.hotels;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class HotelsNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(HotelsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String hotelNotFoundHandler(HotelsNotFoundException ex) {
        return ex.getMessage();
    }
}