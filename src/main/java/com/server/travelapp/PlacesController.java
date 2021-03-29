package com.server.travelapp;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class PlacesController {

    private final PlacesRepository repository;



    PlacesController(PlacesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/places")
    public ResponseEntity all() {

        List<Places> places = repository.findAll();

        return new ResponseEntity(places, HttpStatus.OK);
    }


    @GetMapping("/places/{id}")
    public ResponseEntity one(@PathVariable Long id) {

        Places places = repository.findById(id).orElseThrow(() -> new PlacesNotFoundException(id));

        return new ResponseEntity(places, HttpStatus.OK);
    }


}

