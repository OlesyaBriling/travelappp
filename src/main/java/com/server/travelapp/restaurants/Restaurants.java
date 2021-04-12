package com.server.travelapp.restaurants;

import com.server.travelapp.restaurants.address.AddressRestaurants;
import com.server.travelapp.restaurants.average_check.AverageCheck;
import com.server.travelapp.restaurants.workingTime.WorkingTime;
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
@Table(name = "Restaurants")
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String NameRestaurants;

    private String type;

    @OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "id", referencedColumnName = "id")
    private AddressRestaurants addressRestaurant;

    @OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "id", referencedColumnName = "id")
    private WorkingTime workingTime;

    @OneToOne(cascade = CascadeType.ALL)
    private AverageCheck averageCheck;

    private String photo;

    private String cuisine;

}
