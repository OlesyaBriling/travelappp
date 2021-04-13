package com.server.travelapp.hotels;

import com.server.travelapp.accounts.Accounts;
import com.server.travelapp.accounts.AccountsRepository;
import com.server.travelapp.accounts.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IHotelService {

    @Autowired
    private JdbcTemplate jtm;
    HotelsRepository hotelsRepository;


    @Override
    public List<Hotels> findAll(){
       String sql = "SELECT * FROM Hotels";
       return jtm.query(sql, new BeanPropertyRowMapper<>(Hotels.class));
   }

}
