package com.server.travelapp.places;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public  interface PlacesRepository extends JpaRepository<Places, Long> {

}
