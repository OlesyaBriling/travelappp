package com.server.travelapp.transport.ThreadTransport;

import com.server.travelapp.transport.carrier.Carrier;
import com.server.travelapp.transport.interval.Interval;
import com.server.travelapp.transport.transportSubtype.TransportSubtype;
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
public class ThreadTransport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uid;

    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    private Interval interval;

    private String number;

    private String thread_method_link;

    @OneToOne(cascade = CascadeType.ALL)
    private Carrier carrier;

    private String transport_type;

    private String vehicle;

    @OneToOne(cascade = CascadeType.ALL)
    private TransportSubtype transport_subtype;
}

