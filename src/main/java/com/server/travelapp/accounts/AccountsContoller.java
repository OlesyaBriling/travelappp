package com.server.travelapp.accounts;

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
public class AccountsContoller {

    private final AccountsRepository repository;



    AccountsContoller(AccountsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/accounts")
    public ResponseEntity all() {

        List<Accounts> accounts = repository.findAll();

        return new ResponseEntity(accounts, HttpStatus.OK);
    }


    @GetMapping("/accounts/{id}")
    public ResponseEntity one(@PathVariable Long id) {

        Accounts account = repository.findById(id).orElseThrow(() -> new AccountsNotFoundException(id));

        return new ResponseEntity(account, HttpStatus.OK);
    }



}
