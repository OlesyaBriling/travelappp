package com.server.travelapp.places;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PlaceNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(PlacesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String placeNotFoundHandler(PlacesNotFoundException ex) {
        return ex.getMessage();
    }

}
