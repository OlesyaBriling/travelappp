package com.server.travelapp.restaurants;


import com.server.travelapp.places.PlacesController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantsController {



    private final RestaurantsRepository repository;

    RestaurantsController(RestaurantsRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   // @GetMapping(value = "/restaurants", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity all() {
        List<Restaurants> restaurants = repository.findAll();

        return new ResponseEntity(restaurants, HttpStatus.OK);
    }

    @GetMapping(value = "/restaurant/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity one(@PathVariable Long id) {
        Restaurants restaurants = repository.findById(id).orElseThrow(() -> new RestaurantsNotFoundException(id));

        return new ResponseEntity(restaurants, HttpStatus.OK);
    }

}
