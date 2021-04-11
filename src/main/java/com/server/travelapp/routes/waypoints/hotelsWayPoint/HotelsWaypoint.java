package com.server.travelapp.routes.waypoints.hotelsWayPoint;


import com.server.travelapp.customsum.Customsum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "HotelsWaypoint")
@NoArgsConstructor
@AllArgsConstructor
public class HotelsWaypoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @OneToOne
//    @JoinColumn(name = "id", referencedColumnName = "id")
    private Long id;

    @OneToOne
    private Customsum customsum;



}
