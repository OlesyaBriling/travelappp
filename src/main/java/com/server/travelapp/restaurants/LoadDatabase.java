//package com.server.travelapp.restaurants;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class LoadDatabase {
//
//    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//    @Bean
//    CommandLineRunner initDatabase(RestaurantsRepository repository) {
//
//        return args -> {
//            log.info("Preloading" + repository.save(new Restaurants(1L, "cafe", "Volga", "Russia", "Saint-Pt.", "Moskovskaya", 3, "8:00", "21:00", "10:00", "00:00", 500, "RUB", "photo", "italian")));
//            log.info("Preloading" + repository.save(new Restaurants(2L, "cafe", "Volga", "Russia", "Saint-Pt.", "Moskovskaya", 3, "8:00", "21:00", "10:00", "00:00", 500, "RUB", "photo", "italian")));
//        };
//
//    }
//
//}
