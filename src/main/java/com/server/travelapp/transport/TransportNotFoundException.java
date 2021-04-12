package com.server.travelapp.transport;

public class TransportNotFoundException extends RuntimeException{
   TransportNotFoundException (Long id) {
        super("Could not found transport " + id);
    }
}
