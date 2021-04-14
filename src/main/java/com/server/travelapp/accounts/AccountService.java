package com.server.travelapp.accounts;

import io.micrometer.core.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private JdbcTemplate jtm;


    AccountsRepository accountsRepository;

    public AccountService(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @Override
    public List<Accounts> findAll(){
       String sql = "SELECT * FROM Accounts";
       return jtm.query(sql, new BeanPropertyRowMapper<>(Accounts.class));
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
