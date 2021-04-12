package com.server.travelapp.transport;

import com.server.travelapp.hotels.Hotels;
import com.server.travelapp.hotels.HotelsNotFoundException;
import com.server.travelapp.hotels.HotelsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransportController {


    private final TransportRepository repository;



    TransportController(TransportRepository repository) {
        this.repository = repository;
    }

    @GetMapping("api.rasp.yandex.net/v3.0/search/?apikey=048c6249-d426-450f-a074-db013bd9edc1&format=json&from={idFrom}&to={idTo}lang=ru_RU&page=1")
    public ResponseEntity all() {

        List<Transport> transports = repository.findAll();

        return new ResponseEntity(transports, HttpStatus.OK);
    }




}
