package com.server.travelapp.restaurants;

import org.springframework.data.jpa.repository.JpaRepository;

  public interface RestaurantsRepository extends JpaRepository<Restaurants, Long> {
    }

