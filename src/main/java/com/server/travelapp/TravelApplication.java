package com.server.travelapp;
;
import com.server.travelapp.accounts.Accounts;
import com.server.travelapp.accounts.AccountsRepository;
import com.server.travelapp.restaurants.Restaurants;
import com.server.travelapp.restaurants.RestaurantsRepository;
import com.server.travelapp.restaurants.address.AddressRestaurants;
import com.server.travelapp.restaurants.address.AddressRestaurantsRepository;
import com.server.travelapp.restaurants.workingTime.WorkingTime;
import com.server.travelapp.restaurants.workingTime.weekdays.WeekdaysWorkingTime;
import com.server.travelapp.restaurants.workingTime.weekends.WeekendsWorkingTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class TravelApplication {

    public static void main(String[] args) {

        SpringApplication.run(TravelApplication.class, args);

    }


}
