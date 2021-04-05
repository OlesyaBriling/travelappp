package com.server.travelapp.roots.waypoints;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.management.relation.RoleInfoNotFoundException;

@ControllerAdvice
public class WaypointsNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(RoleInfoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String waypointNotFoundHandler(RoleInfoNotFoundException ex) {
        return ex.getMessage();
    }

}