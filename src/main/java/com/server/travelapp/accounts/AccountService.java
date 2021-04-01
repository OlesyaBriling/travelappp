package com.server.travelapp.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountsRepository accountsRepository;

    public List<Accounts> getAllAccounts() {
        List<Accounts> persons = new ArrayList<Accounts>();
        accountsRepository.findAll().forEach(person -> persons.add(person));
        return persons;
    }

    public Accounts getAccountById(Long id) {
        return accountsRepository.findById(id).get();
    }

    public void saveOrUpdate(Accounts account) {
        accountsRepository.save(account);
    }

    public void delete(Long id) {
        accountsRepository.deleteById(id);
    }
}
