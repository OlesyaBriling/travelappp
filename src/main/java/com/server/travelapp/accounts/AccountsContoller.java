package com.server.travelapp.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountsContoller {

//    @Autowired
  //  private IAccountService iAccountService;

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

    @RequestMapping(value = "/api/register")
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
