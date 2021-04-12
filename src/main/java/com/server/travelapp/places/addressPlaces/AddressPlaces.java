package com.server.travelapp.places.addressPlaces;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address_places")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressPlaces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String city;
    private String street;
    private Integer building;

}