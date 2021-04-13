package com.server.travelapp;


import com.server.travelapp.accounts.Accounts;
import com.server.travelapp.accounts.AccountsRepository;
import com.server.travelapp.hotels.Hotels;
import com.server.travelapp.hotels.HotelsRepository;
import com.server.travelapp.hotels.address.AddressHotels;
import com.server.travelapp.hotels.comfortsHotel.ComfortsHotel;
import com.server.travelapp.hotels.rooms.Rooms;
import com.server.travelapp.hotels.rooms.beds.Beds;
import com.server.travelapp.hotels.rooms.comfots.Comforts;
import com.server.travelapp.hotels.rooms.price.PriceRooms;
import com.server.travelapp.hotels.workingTimeHotels.WorkingTimeHotels;
import com.server.travelapp.hotels.workingTimeHotels.weekdays.WeekdaysWorkingTimeHotels;
import com.server.travelapp.hotels.workingTimeHotels.weekends.WeekendsWorkingTimeHotels;
import com.server.travelapp.places.Places;
import com.server.travelapp.places.PlacesRepository;
import com.server.travelapp.places.addressPlaces.AddressPlaces;
import com.server.travelapp.places.pricePlaces.Amount;
import com.server.travelapp.places.pricePlaces.PricePlaces;
import com.server.travelapp.places.workingTimePlaces.WorkTimePlaces;
import com.server.travelapp.places.workingTimePlaces.weekdays.WorkTimePlacesWeekdays;
import com.server.travelapp.places.workingTimePlaces.weekends.WorkTimePlacesWeekends;
import com.server.travelapp.restaurants.Restaurants;
import com.server.travelapp.restaurants.RestaurantsRepository;
import com.server.travelapp.restaurants.address.AddressRestaurants;
import com.server.travelapp.restaurants.average_check.AverageCheck;
import com.server.travelapp.restaurants.workingTime.WorkingTime;
import com.server.travelapp.restaurants.workingTime.weekdays.WeekdaysWorkingTime;
import com.server.travelapp.restaurants.workingTime.weekends.WeekendsWorkingTime;
import com.server.travelapp.routes.Comments.Comments;
import com.server.travelapp.routes.Routes;
import com.server.travelapp.routes.RoutesRepository;
import com.server.travelapp.routes.budget.Budget;
import com.server.travelapp.routes.movements.Movements;
import com.server.travelapp.routes.pointDeparture.PointDeparture;
import com.server.travelapp.routes.waypoints.Waypoints;
import com.server.travelapp.routes.waypoints.amountSpent.AmountSpent;
import com.server.travelapp.routes.waypoints.amountSpent.amountSpentAny.HotelsAmountSpent;
import com.server.travelapp.routes.waypoints.amountSpent.amountSpentAny.PlacesAmountSpent;
import com.server.travelapp.routes.waypoints.amountSpent.amountSpentAny.RestaurantsAmountSpent;
import com.server.travelapp.routes.waypoints.hotelsWayPoint.HotelsWaypoint;
import com.server.travelapp.routes.waypoints.placesWayPoint.PlacesWaypoint;
import com.server.travelapp.routes.waypoints.pointPlace.PointPlace;
import com.server.travelapp.routes.waypoints.residenceTime.ResidenceTime;
import com.server.travelapp.routes.waypoints.restaurantsWaypoint.RestaurantsWaypoint;
import com.server.travelapp.customsum.Customsum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.util.ArrayList;


@Configuration
public class LoadDatabase {

    private static final Logger log =  LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PlacesRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Places(1L, "Петергоф",
                    new AddressPlaces(1L ,"Россия", "Санкт-Петербург", null , null),
                    new WorkTimePlaces(1L, new WorkTimePlacesWeekdays(1L, "9:00", "21:00"),
                            new WorkTimePlacesWeekends(1L, "10:00", "23:00")),
                    new PricePlaces(1L, new Amount(1L, 200, 500), "RUB"),
                    "link.com")));

            log.info("Preloading " + repository.save(new Places(2L, "Петергоф",
                    new AddressPlaces(1L ,"Россия", "Санкт-Петербург", null , null),
                    new WorkTimePlaces(1L, new WorkTimePlacesWeekdays(1L, "9:00", "21:00"),
                            new WorkTimePlacesWeekends(1L, "10:00", "23:00")),
                    new PricePlaces(1L, new Amount(1L, 200, 500), "RUB"),
                    "link.com")));
        };
    }

    @Bean
    CommandLineRunner initDatabase1(RestaurantsRepository repository) {

        return args -> {
            log.info("Preloading" + repository.save(new Restaurants(1L , "Name_Restaurant", "cafe",
                    new AddressRestaurants(1L ,  "Russia", "Saint-Pt.", "Moskovskaya", 3),
                    (new WorkingTime(1L, new WeekdaysWorkingTime(1L, "8:00", "21:00"), new WeekendsWorkingTime(1L, "10:00", "00:00"))) ,
                    new AverageCheck(1L, 500, "RUB"), "photo", "italian")));

            log.info("Preloading" + repository.save(new Restaurants(2L,"Name_Restaurant", "cafe",
                    new AddressRestaurants(1L ,  "Russia", "Saint-Pt.", "Moskovskaya", 3),
                    (new WorkingTime(1L, new WeekdaysWorkingTime(1L, "8:00", "21:00"), new WeekendsWorkingTime(1L, "10:00", "00:00"))) ,
                    new AverageCheck(1L, 500, "RUB"), "photo", "italian")));
        };

    }

    @Bean
    CommandLineRunner initDatabase2(HotelsRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Hotels(1L, "Seliger",
                    new ArrayList<>(){{add(new ComfortsHotel(1L, "wi-fi"));}},
                    new AddressHotels(1L, "Russia", "Tver", null, null),
                    new ArrayList<>(){{ add(new Rooms(1L,
                                    new PriceRooms(1L, 300, "RUB"),
                                    new ArrayList<>(){{add(new Beds(1L, 2, 3));}},
                                    new ArrayList<>(){{add(new Comforts(1L, "shower"));}}));
                            add(new Rooms(2L,
                                            new PriceRooms(1L, 300, "RUB"),
                                            new ArrayList<>(){{add(new Beds(1L, 2, 3));}},
                                            new ArrayList<>(){{add(new Comforts(1L, "shower"));}}));}},
                    new WorkingTimeHotels(1L, new WeekdaysWorkingTimeHotels(1L, "8:00", "21:00"), new WeekendsWorkingTimeHotels(1L, "10:00", "00:00")))));

               log.info("Preloading" + repository.save(new Hotels(2L, "Seliger",
                    new ArrayList<>(){{add(new ComfortsHotel(1L, "wi-fi"));}},
                    new AddressHotels(1L, "Russia", "Tver", null, null),
                    new ArrayList<>(){{   add(new Rooms(2L,
                            new PriceRooms(1L, 300, "RUB"),
                            new ArrayList<>(){{add(new Beds(1L, 2, 3));}},
                            new ArrayList<>(){{add(new Comforts(1L, "shower"));}}));
                        add(new Rooms(2L,
                                new PriceRooms(1L, 300, "RUB"),
                                new ArrayList<>(){{add(new Beds(1L, 2, 3));}},
                                new ArrayList<>(){{add(new Comforts(1L, "shower"));}}));}},
                    new WorkingTimeHotels(1L, new WeekdaysWorkingTimeHotels(1L, "8:00", "21:00"), new WeekendsWorkingTimeHotels(1L, "10:00", "00:00")))));
        };
    }

//    @Bean
//    public DataSource dataSource(){
//        EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
//        return embeddedDatabaseBuilder.addScript("classpath:src/main/resources/application.properties/data.sql")
//                .addScript("classpath:src/main/resources/application.properties/data.sql")
//                .setType(EmbeddedDatabaseType.H2)
//                .build();
//    }

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
//
    @Bean
    CommandLineRunner initDatabase5(RoutesRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Routes(1L, "Поездка", "01/01/21", "15/01/21",  new PointDeparture(1L, true, 3L, "Tver'"),
                    (new Budget(2L, 100000, "RUB")),
                    new ArrayList<>(){{add(new Waypoints(1L, false,
                             new PointPlace(3L,  "Tver'", "Russia" ),
                                    new ResidenceTime(1L, "11/11/21", "14/11/21"),
                                      new ArrayList<>(){{add(new RestaurantsWaypoint( 1L, new Customsum(1L, 3000, "RUB")));}},
                            new ArrayList<>(){{add(new HotelsWaypoint(2L, new Customsum(1L, 2500, "RUB")));}},
                            new ArrayList<>(){{add(new PlacesWaypoint(3L, new Customsum(5L, 2500, "RUB")));}},
                                      new AmountSpent(1L, 50000, "RUB",
                                              new RestaurantsAmountSpent(1L, 30000, "RUB"),
                                              new HotelsAmountSpent(1L, 20000, "RUB"),
                                              new PlacesAmountSpent(2L, 15000, "RUB"))));

                        add(new Waypoints(3L, false,
                  new PointPlace(1L, "Novgorod", "Russia"),
                            new ResidenceTime(1L, "11/11/21", "14/11/21"),
                                new ArrayList<>(){{add(new RestaurantsWaypoint( 4L, new Customsum(2L, 3000, "RUB")));}},
                               new ArrayList<>(){{add(new HotelsWaypoint(5L, new Customsum(4L, 2500, "RUB")));}},
                                new ArrayList<>(){{add(new PlacesWaypoint(6L, new Customsum(6L, 2500, "RUB")));}},
                                   new AmountSpent(2L, 30000, "RUB",
                                           new RestaurantsAmountSpent(1L, 30000, "RUB"),
                                           new HotelsAmountSpent(1L, 20000, "RUB"),
                                           new PlacesAmountSpent(2L, 15000, "RUB"))));}},
                 new ArrayList<>(){{add(new Movements(1L, 1L, 2L, "12/12/21", "Airplane", 3300)); add(new Movements(2L, 2L, 3L, "20/12/21", "Bus", 300));}},
                    new ArrayList<>(){{add(new Comments(1L, "Olesya", "Comment's text"));}},
                    0)));



            log.info("Preloading" + repository.save(new Routes(2L , "Поездка1", "10/05/21", "20/05/21",  new PointDeparture(2L, true, 4L, "Kazan'"),
                    (new Budget(2L, 100000, "RUB")),
                    new ArrayList<>(){{add(new Waypoints(2L, false,
                          new PointPlace(2L, "Kazan'", "Russia"),
                                    new ResidenceTime(2L, "20/11/20", "25/11/20"),
                            new ArrayList<>(){{add(new RestaurantsWaypoint( 6L, new Customsum(7L, 3000, "RUB")));}},
                           new ArrayList<>(){{add(new HotelsWaypoint(8L, new Customsum(8L, 2500, "RUB")));}},
                            new ArrayList<>(){{add(new PlacesWaypoint(9L, new Customsum(9L, 2500, "RUB")));}},
                                         new AmountSpent(2L, 30000, "RUB",
                                                 new RestaurantsAmountSpent(1L, 30000, "RUB"),
                                                 new HotelsAmountSpent(1L, 20000, "RUB"),
                                                 new PlacesAmountSpent(2L, 15000, "RUB"))));
            add(new Waypoints(4L, false,
                   new PointPlace(4L, "Saint-Pt.", "Russia"),
                            new ResidenceTime(4L, "11/11/21", "14/11/21"),
                    new ArrayList<>(){{add(new RestaurantsWaypoint( 4L, new Customsum(10L, 3000, "RUB")));}},
                    new ArrayList<>(){{add(new HotelsWaypoint(5L, new Customsum(11L, 2500, "RUB")));}},
                    new ArrayList<>(){{add(new PlacesWaypoint(6L, new Customsum(12L, 2500, "RUB")));}},
                                   new AmountSpent(4L, 30000, "RUB",
                                           new RestaurantsAmountSpent(1L, 30000, "RUB"),
                                           new HotelsAmountSpent(1L, 20000, "RUB"),
                                           new PlacesAmountSpent(2L, 15000, "RUB"))));}},
              new ArrayList<>(){{add(new Movements(1L, 1L, 2L, "12/12/21", "Airplane", 3300)); add(new Movements(2L, 2L, 3L, "20/12/21", "Bus", 300));}},
                    new ArrayList<>(){{add(new Comments(1L, "Olesya", "Comment's text"));}},
                                   0)));
        };
    }

//        @Bean
//    CommandLineRunner initDataBase6(TransportRepository repository) {
//        return args -> {
//            log.info("Preloading" + repository.save(new Transport(1L, "Tver", "Moscow")));
//            log.info("Preloading" + repository.save(new Transport(3L, "Moscow", "Kazan'")));
//        };
//    }


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
