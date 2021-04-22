package com.server.travelapp.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@RestController
public class AccountsContoller {


    private final AccountsRepository repository;

    private final AccountService accountService;

    AccountsContoller(AccountsRepository repository, AccountService accountService) {
        this.repository = repository;
        this.accountService = accountService;

    }

    @RequestMapping(value = "/accounts")
    public List<Accounts> findAccounts() {
        return accountService.findAll();
    }


    @GetMapping(value = "/accounts/{id}")
    public ResponseEntity one(@PathVariable Long id) {

        Accounts account = repository.findById(id).orElseThrow(() -> new AccountsNotFoundException(id));

        return new ResponseEntity(account, HttpStatus.OK);
    }

    @PostMapping(
            value = "/createPerson", consumes = "application/json", produces = "application/json")
    public Accounts createPerson(@RequestBody Accounts account) {
        return accountService.saveUpdatePerson(account);
    }

//    @RequestMapping(value = "/api/register", consumes = "application/json")
//    public Long addAccount(@RequestBody Accounts account) {
//        accountService.saveOrUpdate(account);
//        return account.getId();
//    }

//    @RequestMapping(value = "/api/register", consumes = "application/json")
//    public ResponseEntity save(@PathVariable Long id ) {
//    Accounts account = repository.save()
//         return new ResponseEntity(account, HttpStatus.OK);
//    }

//    @RequestMapping(value = "/api/register", consumes = "application/json")
//    public ResponseEntity update(@PathVariable Long id) {
//        Accounts account = repository.update(id);
//        return new ResponseEntity(account, HttpStatus.OK);
//    }

    @DeleteMapping("/account/{id}")
    public void deleteAccount(@PathVariable("id") Long id) {
        Accounts account = repository.deleteById();
        System.out.println("Вы удалили аккаунт " + repository.findById(id));

    }
}



