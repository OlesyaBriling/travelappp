package com.server.travelapp.hotels.address;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address_hotels")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressHotels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String city;
    private String street;
    private Integer building;




}
