package com.server.travelapp.routes.waypoints;


import com.server.travelapp.routes.Routes;
import com.server.travelapp.routes.waypoints.amountSpent.AmountSpent;
import com.server.travelapp.routes.waypoints.hotelsWayPoint.HotelsWaypoint;
import com.server.travelapp.routes.waypoints.placesWayPoint.PlacesWaypoint;
import com.server.travelapp.routes.waypoints.pointPlace.PointPlace;
import com.server.travelapp.routes.waypoints.residenceTime.ResidenceTime;
import com.server.travelapp.routes.waypoints.restaurantsWaypoint.RestaurantsWaypoint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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

    private boolean isStart;

   @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
   //@JoinColumn(name = "id", referencedColumnName = "id")
   private PointPlace pointPlace;

//
   @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  //  @JoinColumn(name = "id", referencedColumnName = "id")
   private ResidenceTime residenceTime;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurantsWaypoint_id")
    private List<RestaurantsWaypoint> restaurantsWaypoint;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotelsWaypoint_id")
    private List<HotelsWaypoint> hotelsWaypoint;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "placesWaypoint_id")
    private List<PlacesWaypoint> placesWaypoint;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
 //   @JoinColumn(name = "id", referencedColumnName = "id")
    private AmountSpent amountSpent;

}
