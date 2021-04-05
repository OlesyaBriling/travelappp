package com.server.travelapp.roots.waypoints;


import com.server.travelapp.roots.Routes;
import jdk.jfr.MemoryAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "Waypoints")
@NoArgsConstructor
@AllArgsConstructor
public class Waypoints {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long waypoints_id;

    @ManyToOne
  // @JoinColumn(name = "routes_id" )
    private Routes routes;

//    private Place place;
//
//    private ResidenceTime residenceTime;
//
//    private RestaurantsWaypoint restaurantsWaypoint;
//
//    private HotelsWayPoint hotelsWayPoint;
//
//    private PlacesWayPoint placesWayPoint;
//
//    private AmountSpent amountSpent;

}
