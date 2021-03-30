package com.server.travelapp.restaurants;

public class RestaurantsNotFoundException extends RuntimeException{

    RestaurantsNotFoundException(Long id) {
        super("Could not found restaurants " + id);
    }

}
