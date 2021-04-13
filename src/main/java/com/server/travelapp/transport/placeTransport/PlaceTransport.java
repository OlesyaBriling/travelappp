package com.server.travelapp.transport.placeTransport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlaceTransport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String title;
    private String station_type;
    private String station_type_name;
    private String transport_type;
    private String type;
}
