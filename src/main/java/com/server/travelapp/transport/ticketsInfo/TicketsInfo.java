package com.server.travelapp.transport.ticketsInfo;

import com.server.travelapp.transport.ticketPlace.TicketPlace;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketsInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean et_marker;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TicketPlace> places;
}
