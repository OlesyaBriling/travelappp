package com.server.travelapp.hotels.address;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AddressHotelsController {

        private final AddressHotelsRepository repository;

        AddressHotelsController(AddressHotelsRepository repository) {
            this.repository = repository;
        }

        @GetMapping("/hotels/address")
        public ResponseEntity all() {
            List<AddressHotels> addressHotels  = repository.findAll();

            return new ResponseEntity(addressHotels, HttpStatus.OK);
        }

        @GetMapping("/hotels/address/{id}")
        public ResponseEntity one(@PathVariable Long id) {
            AddressHotels addressHotels = repository.findById(id).orElseThrow(() -> new AddressHotelsNotFoundException(id));

            return new ResponseEntity(addressHotels, HttpStatus.OK);
        }
}
