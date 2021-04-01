package com.server.travelapp.accounts;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountsContoller {


    private final AccountsRepository repository;

    private final AccountService accountService;

    AccountsContoller(AccountsRepository repository, AccountService accountService) {
        this.repository = repository;
        this.accountService = accountService;
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

    @PostMapping(path = "/api/register", consumes = "application/json")
    public String addAccount(@RequestBody Accounts account) {
        accountService.saveOrUpdate(account);
        return account.getId().toString();
    }

    @DeleteMapping("/account/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.delete(id);
        System.out.println("Вы удалили аккаунт " + accountService.getAccountById(id));
    }



}
