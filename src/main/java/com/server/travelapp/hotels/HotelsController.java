package com.server.travelapp.hotels;

import com.server.travelapp.hotels.rooms.Rooms;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelsController {

    private final HotelsRepository repository;




    HotelsController(HotelsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hotels")
    public ResponseEntity all() {

        List<Hotels> hotels = repository.findAll();

        return new ResponseEntity(hotels, HttpStatus.OK);
    }


    @GetMapping("/hotels/{id}")
    public ResponseEntity one(@PathVariable Long id) {

        Hotels hotel = repository.findById(id).orElseThrow(() -> new HotelsNotFoundException(id));

        return new ResponseEntity(hotel, HttpStatus.OK);
    }


}
