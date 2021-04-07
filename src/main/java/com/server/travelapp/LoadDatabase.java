package com.server.travelapp;


import com.server.travelapp.accounts.Accounts;
import com.server.travelapp.accounts.AccountsRepository;
import com.server.travelapp.hotels.Hotels;
import com.server.travelapp.hotels.HotelsRepository;
import com.server.travelapp.places.Places;
import com.server.travelapp.places.PlacesRepository;
import com.server.travelapp.restaurants.Restaurants;
import com.server.travelapp.restaurants.RestaurantsRepository;
import com.server.travelapp.restaurants.address.AddressRestaurants;
import com.server.travelapp.routes.Routes;
import com.server.travelapp.routes.RoutesRepository;
import com.server.travelapp.routes.waypoints.Waypoints;
import com.server.travelapp.routes.waypoints.amountSpent.AmountSpent;
import com.server.travelapp.routes.waypoints.pointPlace.PointPlace;
import com.server.travelapp.routes.waypoints.residenceTime.ResidenceTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;


@Configuration
public class LoadDatabase {

    private static final Logger log =  LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PlacesRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Places(1L, "Петергоф", "Россия", "Санкт-Петербург", " ", null, "9:00", "21:00", "10:00", "23:00" )));
            log.info("Preloading " + repository.save(new Places(2L, "Мост", "Россия", "Санкт-Петербург", " ", null, "9:00", "21:00", "10:00", "23:00")));
        };
    }

    @Bean
    CommandLineRunner initDatabase1(RestaurantsRepository repository) {

        return args -> {
            log.info("Preloading" + repository.save(new Restaurants(1L ,new AddressRestaurants(1L ,  "Russia", "Saint-Pt.", "Moskovskaya", 3), "cafe", "Volga", "8:00", "21:00", "10:00", "00:00", 500, "RUB", "photo", "italian")));
            log.info("Preloading" + repository.save(new Restaurants(2L, new AddressRestaurants(2L,"Russia", "Saint-Pt.", "Moskovskaya", 3) ,"cafe", "Volga", "8:00", "21:00", "10:00", "00:00", 500, "RUB", "photo", "italian")));
        };

    }

    @Bean
    CommandLineRunner initDatabase2(HotelsRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Hotels(1L, "Seliger")));
            log.info("Preloading" + repository.save(new Hotels(2L, "Seliger")));
        };
    }

    @Bean
    CommandLineRunner initDatabase3(AccountsRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Accounts(1L, "olesabrilng@gmail.com", "124536fg", "OlesyaBriling", "09/01/2002", "Tver")));
            log.info("Preloading" + repository.save(new Accounts(2L, "artem@gmail.com", "896536hu", "Artem01", "23/07/2001", "Tver")));
        };
    }

//    @Bean
//    CommandLineRunner initDatabase4(AddressRestaurantsRepository repository) {
//        return args -> {
//            log.info("Preloading" + repository.save(new AddressRestaurants(1L ,  "Russia", "Saint-Pt.", "Moskovskaya", 3)));
//            log.info("Preloading" + repository.save(new AddressRestaurants(2L,"Russia", "Saint-Pt.", "Moskovskaya", 3)));
//        };
//    }

    @Bean
    CommandLineRunner initDatabase5(RoutesRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Routes(1L, "Поездка", "01/01/21", "15/01/21",
                    new ArrayList<>(){{add(new Waypoints(1L,
                            (new PointPlace(3L,  "Tver'", "Russia" )),
                                    new ResidenceTime(1L, "11/11/21", "14/11/21"),
                                        new AmountSpent(1L, 50000, "RUB")));

            add(new Waypoints(3L,
                    new PointPlace(1L, "Novgorod", "Russia"),
                            new ResidenceTime(1L, "11/11/21", "14/11/21"),
                                    new AmountSpent(2L, 30000, "RUB")));}},  0)));


            log.info("Preloading" + repository.save(new Routes(2L , "Поездка1", "10/05/21", "20/05/21",
                    new ArrayList<>(){{add(new Waypoints(2L,
                            new PointPlace(4L, "Kazan'", "Russia"),
                                    new ResidenceTime(1L, "20/11/20", "25/11/20"),
                                             new AmountSpent(2L, 30000, "RUB")));
            add(new Waypoints(4L,
                    new PointPlace(2L, "Saint-Pt.", "Russia"),
                            new ResidenceTime(1L, "11/11/21", "14/11/21"),
                                    new AmountSpent(2L, 30000, "RUB")));}}  ,0)));
        };
    }

//        @Bean
//    CommandLineRunner initDataBase6(WaypointsRepository repository) {
//        return args -> {
//            log.info("Preloading" + repository.save(new Waypoints(1L, new PointPlace(1L, "Tver", "Russia"), "Russia")));
//            log.info("Preloading" + repository.save(new Waypoints(3L, new PointPlace(1L, "Moscow", "Russia"), "Russia")));
//        };
//    }

//    @Bean
//    CommandLineRunner initDataBase6(PointPlaceRepository repository) {
//        return args -> {
//            log.info("Preloading" + repository.save(new PointPlace(1L, "Tver", "Russia")));
//            log.info("Preloading" + repository.save(new PointPlace(3L, "Moscow", "Russia")));
//        };
//    }





}
