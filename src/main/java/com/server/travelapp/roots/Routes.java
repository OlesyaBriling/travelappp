package com.server.travelapp.roots;

import com.server.travelapp.roots.movements.Movements;
import com.server.travelapp.roots.pointDeparture.PointDeparture;
import com.server.travelapp.roots.waypoints.Waypoints;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Routes")
public class Routes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name_route;

    private String begin_date;

    private String ending_date;

//    private PointDeparture point_departure;
//
//    private Budget budget;

    @OneToMany(mappedBy = "routes", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Waypoints> waypoints = new ArrayList<>();

//    private Movements movements;
//
//    private Comments comments;

    private Integer likes;


}
