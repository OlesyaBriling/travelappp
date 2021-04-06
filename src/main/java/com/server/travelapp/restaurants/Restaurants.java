package com.server.travelapp.restaurants;

import com.server.travelapp.restaurants.address.AddressRestaurants;
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


  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id", referencedColumnName = "id")
   private AddressRestaurants addressRestaurant;

    private String type;

    private String NameRestaurants;

    private String weekdays_startwork;

    private String weekdays_endwork;

    private String weekends_startwork;

    private String weekends_endwork;

    private Integer amount;

    private String currency;

    private String photo;

    private String cuisine;


    @Override
    public String toString() {
        return "Restaurants{" +
                "Id=" + id +
                ", NameRestaurants='" + NameRestaurants + '\'' +
                ", weekdays_startwork='" + weekdays_startwork + '\'' +
                ", weekdays_endwork='" + weekdays_endwork + '\'' +
                ", weekends_startwork='" + weekends_startwork + '\'' +
                ", weekends_endwork='" + weekends_endwork + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", photo='" + photo + '\'' +
                ", cuisine='" + cuisine + '\'' +
                '}';
    }
}
