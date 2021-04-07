package com.server.travelapp.routes;

import com.server.travelapp.routes.pointDeparture.PointDeparture;
import com.server.travelapp.routes.waypoints.Waypoints;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
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

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private PointDeparture pointDeparture;
//
//    private Budget budget;

    @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "routes_id")
    private List<Waypoints> waypoints;


//    private Movements movements;
//
//    private Comments comments;

    private Integer likes;


}
