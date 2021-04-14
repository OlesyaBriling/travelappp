package com.server.travelapp.accounts;

import io.micrometer.core.lang.NonNull;

import java.util.List;

public interface IAccountService {

        List<Accounts> findAll();


}
