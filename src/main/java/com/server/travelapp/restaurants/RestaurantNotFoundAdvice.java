package com.server.travelapp.restaurants;

import com.server.travelapp.places.PlacesNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestaurantNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(RestaurantsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String restaurantNotFoundHandler(RestaurantsNotFoundException ex) {
        return ex.getMessage();
    }

}
