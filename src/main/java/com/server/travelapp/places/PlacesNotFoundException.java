package com.server.travelapp.places;

public class PlacesNotFoundException extends RuntimeException {

    PlacesNotFoundException(Long id) {
        super("Could not found place " + id);
    }
}
