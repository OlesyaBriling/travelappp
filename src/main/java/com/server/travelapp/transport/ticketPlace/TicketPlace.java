package com.server.travelapp.transport.ticketPlace;

import com.server.travelapp.transport.PriceTransport.PriceTransport;
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
public class TicketPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String currency;

    @OneToOne(cascade = CascadeType.ALL)
    private PriceTransport price;
}
