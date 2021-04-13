package com.server.travelapp.transport;


import com.server.travelapp.transport.ThreadTransport.ThreadTransport;
import com.server.travelapp.transport.placeTransport.PlaceTransport;
import com.server.travelapp.transport.searchInfo.SearchInfo;
import com.server.travelapp.transport.ticketsInfo.TicketsInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Transport")
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String title;

    private String station_type;

    private String station_type_name;

    private String transport_type;

    @OneToOne(cascade = CascadeType.ALL)
    private ThreadTransport thread;

    private String departure_platform;

    private String stops;

    private String departure_terminal;

    @OneToOne(cascade = CascadeType.ALL)
    private PlaceTransport to;

    private boolean has_transfers;

    @OneToOne(cascade = CascadeType.ALL)
    private TicketsInfo tickets_info;

    private Integer duration;

    private String arrival_terminal;

    private String start_date;

    private String arrival_platform;

    @OneToOne(cascade = CascadeType.ALL)
    private PlaceTransport from;

    @OneToOne(cascade = CascadeType.ALL)
    private SearchInfo search;

}
