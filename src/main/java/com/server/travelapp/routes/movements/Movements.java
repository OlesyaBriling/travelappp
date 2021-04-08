package com.server.travelapp.routes.movements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name  = "Movements")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Movements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    private Long pointFrom;

    private Long pointTo;

    private String date;

    private String type;

    private Integer price;

}
