package com.server.travelapp.routes.waypoints;


import com.server.travelapp.routes.waypoints.pointPlace.PointPlace;
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
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "routes_id" )
//    private Routes routes;


   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "id", referencedColumnName = "id")
   private PointPlace pointPlace;
//
   private String residenceTime;

//
//    private RestaurantsWaypoint restaurantsWaypoint;
//
//    private HotelsWayPoint hotelsWayPoint;
//
//    private PlacesWayPoint placesWayPoint;
//
//    private AmountSpent amountSpent;

}
