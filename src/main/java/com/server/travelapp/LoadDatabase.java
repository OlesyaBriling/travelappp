package com.server.travelapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log =  LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PlacesRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Places(1L, "Петергоф", "Россия", "Санкт-Петербург", " ", null, "9:00", "21:00"  )));
            log.info("Preloading " + repository.save(new Places(2L, "Мост", "Россия", "Санкт-Петербург", " ", null, "9:00", "21:00" )));
        };
    }

}
