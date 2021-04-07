package com.server.travelapp.routes.waypoints.pointPlace;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PointPlaceController {

    private final PointPlaceRepository repository;

    public PointPlaceController(PointPlaceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/waypoint/pointplaces")
    public ResponseEntity all() {
        List<PointPlace> pointPlaces = repository.findAll();

        return new ResponseEntity(pointPlaces, HttpStatus.OK);
    }

    @GetMapping("/waypoint/pointplace/{id}")
    public ResponseEntity one(@PathVariable Long id) {
        PointPlace pointPlace = repository.findById(id).orElseThrow(() -> new PointPlaceNotFoundException(id));

        return new ResponseEntity(pointPlace, HttpStatus.OK);
    }

}
