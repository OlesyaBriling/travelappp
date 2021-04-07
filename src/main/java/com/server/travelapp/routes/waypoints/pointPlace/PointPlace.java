package com.server.travelapp.routes.waypoints.pointPlace;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "point_place")
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    private String city;

    private String country;

}
