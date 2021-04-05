package com.server.travelapp.roots;

import com.server.travelapp.restaurants.RestaurantsNotFoundException;

public class RoutesNotFoundException extends RuntimeException {

    RoutesNotFoundException(Long id) {
        super("Could not found routes " + id);
    }
}
