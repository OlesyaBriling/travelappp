package com.server.travelapp.routes.waypoints.residenceTime;


import com.server.travelapp.routes.waypoints.Waypoints;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "residence_time")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String beginDate;

    private String endDate;

}
