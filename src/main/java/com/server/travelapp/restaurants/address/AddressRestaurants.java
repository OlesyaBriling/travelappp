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
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long address_id;

//    @OneToOne(mappedBy = "address_restaurants")
//    private Restaurants restaurant;

    @Column
    private String country;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private Integer building;




}
