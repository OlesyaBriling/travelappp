package com.server.travelapp.restaurants;


import com.server.travelapp.places.PlacesController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantsController {

    private final RestaurantsRepository repository;

    RestaurantsController(RestaurantsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/restaurants")
    public ResponseEntity all() {
        List<Restaurants> restaurants = repository.findAll();

        return new ResponseEntity(restaurants, HttpStatus.OK);
    }

    @GetMapping("/restaurants/{id}")
    public ResponseEntity one(@PathVariable Long id) {
        Restaurants restaurants = repository.findById(id).orElseThrow(() -> new RestaurantsNotFoundException(id));

        return new ResponseEntity(restaurants, HttpStatus.OK);
    }

}
