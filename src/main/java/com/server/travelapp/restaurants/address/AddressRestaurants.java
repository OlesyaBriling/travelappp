package com.server.travelapp.restaurants.address;


import com.server.travelapp.restaurants.Restaurants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address_restaurants")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressRestaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String city;
    private String street;
    private Integer building;




}
