package com.server.travelapp.restaurants.address;

public class AddressRestaurantsNotFoundException extends RuntimeException {

    AddressRestaurantsNotFoundException(Long id) {
        super("Could not found restaurants " + id);
    }
}
