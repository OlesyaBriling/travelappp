package com.server.travelapp.routes;

public class RoutesNotFoundException extends RuntimeException {

    RoutesNotFoundException(Long id) {
        super("Could not found routes " + id);
    }
}
