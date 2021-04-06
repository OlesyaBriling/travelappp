package com.server.travelapp.routes.waypoints;

public class WaypointsNotFoundException extends RuntimeException{

    public WaypointsNotFoundException(Long id) {
        super("Could  not found waypoint " + id);
    }
}
