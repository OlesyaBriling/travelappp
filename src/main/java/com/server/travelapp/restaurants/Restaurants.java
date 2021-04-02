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
@Table(name = "restaurants")
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "restaurants")
    private AddressRestaurants addressRestaurant;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id", referencedColumnName = "address_id")
//    private AddressRestaurants addressRestaurants;

    @Column
    private String type;

    @Column
    private String NameRestaurants;

    @Column
    private String weekdays_startwork;

    @Column
    private String weekdays_endwork;

    @Column
    private String weekends_startwork;

    @Column
    private String weekends_endwork;

    @Column
    private Integer amount;

    @Column
    private String currency;

    @Column
    private String photo;

    @Column
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
