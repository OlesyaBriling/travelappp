package com.server.travelapp.roots.waypoints;

import com.server.travelapp.restaurants.RestaurantsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WaypointsController {


    private final WaypointsRepository repository;

    WaypointsController(WaypointsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/waypoints")
    public ResponseEntity all() {
        List<Waypoints> waypoints = repository.findAll();

        return new ResponseEntity(waypoints, HttpStatus.OK);
    }

    @GetMapping("/waypoint/{id}")
    public ResponseEntity one(@PathVariable Long id) {
        Waypoints waypoints = repository.findById(id).orElseThrow(() -> new WaypointsNotFoundException(id));

        return new ResponseEntity(waypoints, HttpStatus.OK);
    }

}
