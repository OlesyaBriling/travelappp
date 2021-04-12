package com.server.travelapp.places;

import com.server.travelapp.places.addressPlaces.AddressPlaces;
import com.server.travelapp.places.pricePlaces.PricePlaces;
import com.server.travelapp.places.workingTimePlaces.WorkTimePlaces;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Places {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;

    @OneToOne(cascade = CascadeType.ALL)
    private AddressPlaces address;

    @OneToOne(cascade = CascadeType.ALL)
    private WorkTimePlaces workTime;

    @OneToOne(cascade = CascadeType.ALL)
    private PricePlaces price;

    private String link;

}
