package com.server.travelapp.transport.PriceTransport;

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
public class PriceTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int cents;

    private int whole;
}
