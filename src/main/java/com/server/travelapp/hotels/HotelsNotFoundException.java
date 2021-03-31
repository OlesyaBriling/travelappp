package com.server.travelapp.hotels;

public class HotelsNotFoundException extends RuntimeException{


 HotelsNotFoundException(Long id) {
        super("Could not found hotel " + id);
    }
}
