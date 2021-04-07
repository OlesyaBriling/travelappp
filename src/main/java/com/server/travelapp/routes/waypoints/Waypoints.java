package com.server.travelapp.routes.waypoints;


import com.server.travelapp.routes.waypoints.amountSpent.AmountSpent;
import com.server.travelapp.routes.waypoints.pointPlace.PointPlace;
import com.server.travelapp.routes.waypoints.residenceTime.ResidenceTime;
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
    @Column
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "routes_id" )
//    private Routes routes;


   @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
   @JoinColumn(name = "id", referencedColumnName = "id")
   private PointPlace pointPlace;

//
   @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "id")
   private ResidenceTime residenceTime;

//
//    private RestaurantsWaypoint restaurantsWaypoint;
//
//    private HotelsWayPoint hotelsWayPoint;
//
//    private PlacesWayPoint placesWayPoint;
//
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private AmountSpent amountSpent;

}
