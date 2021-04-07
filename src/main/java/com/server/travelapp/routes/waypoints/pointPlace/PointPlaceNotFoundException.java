package com.server.travelapp.routes.waypoints.pointPlace;

public class PointPlaceNotFoundException extends RuntimeException{

    public PointPlaceNotFoundException(Long id) {
        super("Could not found place " + id);
    }
}
