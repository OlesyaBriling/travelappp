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
//
//        ConfigurableApplicationContext configurableApplicationContext =
        SpringApplication.run(TravelApplication.class, args);

//        AccountsRepository accountsRepository =
//                configurableApplicationContext.getBean(AccountsRepository.class);
//
//        Accounts account = new Accounts(1L, "olesabrilng@gmail.com", "124536fg", "OlesyaBriling", "09/01/2002", "Tver" );
//        accountsRepository.save(account);
//
//
//        RestaurantsRepository restaurantsRepository =
//                configurableApplicationContext .getBean(RestaurantsRepository.class);
//
//        Restaurants restaurant = new Restaurants(1L ,  , "cafe", new WorkingTime(1L, new WeekdaysWorkingTime(1L, "8:00", "21:00"), new WeekendsWorkingTime(1L, "10:00", "00:00")) ,"Volga", 500, "RUB", "photo", "italian");
//        restaurantsRepository.save(restaurant);
//
//        AddressRestaurantsRepository addressRestaurantsRepository =
//                configurableApplicationContext.getBean(AddressRestaurantsRepository.class);
//
//        AddressRestaurants addressRestaurant = new AddressRestaurants(1L ,  "Russia", "Saint-Pt.", "Moskovskaya", 3);
//        addressRestaurantsRepository.save(addressRestaurant);


    }


}
