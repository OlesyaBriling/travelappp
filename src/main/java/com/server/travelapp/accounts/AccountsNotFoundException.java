package com.server.travelapp.accounts;

public class AccountsNotFoundException extends RuntimeException{

    AccountsNotFoundException(Long id) {
        super("Could not found account " + id);
    }
}
