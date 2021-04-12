package com.server.travelapp.hotels.rooms.beds;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Beds")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Beds {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer capacity;
    private Integer amount;



}
