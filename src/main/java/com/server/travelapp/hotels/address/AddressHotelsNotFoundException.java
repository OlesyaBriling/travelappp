package com.server.travelapp.hotels.address;

public class AddressHotelsNotFoundException extends RuntimeException {

    AddressHotelsNotFoundException(Long id) {
        super("Could not found hotelsAddress " + id);
    }
}
