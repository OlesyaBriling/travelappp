package com.server.travelapp.hotels;

import com.server.travelapp.accounts.Accounts;

import java.util.List;

public interface IHotelService {

        List<Hotels> findAll();
    //    Accounts findById(Long id);
}
