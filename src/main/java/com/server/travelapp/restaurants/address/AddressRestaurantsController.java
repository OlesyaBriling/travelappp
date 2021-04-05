package com.server.travelapp.restaurants.address;

import com.server.travelapp.accounts.AccountsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AddressRestaurantsController {

        private final AddressRestaurantsRepository repository;

        AddressRestaurantsController(AddressRestaurantsRepository repository) {
            this.repository = repository;
        }

        @GetMapping("/restaurants/address")
        public ResponseEntity all() {
            List<AddressRestaurants> addressRestaurants  = repository.findAll();

            return new ResponseEntity(addressRestaurants, HttpStatus.OK);
        }

        @GetMapping("/restaurants/address/{id}")
        public ResponseEntity one(@PathVariable Long id) {
            AddressRestaurants addressRestaurants = repository.findById(id).orElseThrow(() -> new AddressRestaurantsNotFoundException(id));

            return new ResponseEntity(addressRestaurants, HttpStatus.OK);
        }
}
