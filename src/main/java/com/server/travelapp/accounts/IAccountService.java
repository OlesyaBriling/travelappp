package com.server.travelapp.accounts;



import java.util.List;

public interface IAccountService {

        List<Accounts> findAll();
        Accounts saveUpdatePerson(Accounts account);
        //public Accounts findPersonById(Long id);


}
