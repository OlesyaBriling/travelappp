package com.server.travelapp.hotels;

import com.server.travelapp.accounts.Accounts;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelsController {

    private final HotelsRepository repository;

    private final IHotelService hotelService;

    HotelsController(HotelsRepository repository, IHotelService hotelService) {
        this.repository = repository;
        this.hotelService = hotelService;
    }

    @RequestMapping(value = "/hotels")
    public List<Hotels> findHotels() {
        return hotelService.findAll();
    }


    @GetMapping("/hotels/{id}")
    public ResponseEntity one(@PathVariable Long id) {

        Hotels hotel = repository.findById(id).orElseThrow(() -> new HotelsNotFoundException(id));

        return new ResponseEntity(hotel, HttpStatus.OK);
    }


}
