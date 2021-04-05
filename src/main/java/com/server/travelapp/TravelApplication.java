package com.server.travelapp;


import org.h2.security.auth.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TravelApplication {

    public static void main(String[] args) {

//        ConfigurableApplicationContext configurableApplicationContext =
        SpringApplication.run(TravelApplication.class, args);
    }


}
