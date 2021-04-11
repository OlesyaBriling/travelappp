package com.server.travelapp.routes.waypoints.placesWayPoint;

import com.server.travelapp.customsum.Customsum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "PlacesWaypoint")
@NoArgsConstructor
@AllArgsConstructor
public class PlacesWaypoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @OneToOne
//    @JoinColumn(name = "id", referencedColumnName = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Customsum customsum;
}
