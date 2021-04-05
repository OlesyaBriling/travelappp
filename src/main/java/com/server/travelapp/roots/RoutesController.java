package com.server.travelapp.roots;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoutesController {

    private final RoutesRepository repository;

    RoutesController(RoutesRepository repository){
        this.repository = repository;
    }

    @GetMapping("/routes")
    public ResponseEntity all() {
        List<Routes> routes = repository.findAll();

        return new ResponseEntity(routes, HttpStatus.OK);
    }

    @GetMapping("/routes/{id}")
    public ResponseEntity one(@PathVariable Long id) {
        Routes routes = repository.findById(id).orElseThrow(() -> new RoutesNotFoundException(id));

        return new ResponseEntity(routes, HttpStatus.OK);
    }

}
