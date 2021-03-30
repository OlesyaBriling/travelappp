package com.server.travelapp.restaurants;

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
public class Restaurants {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String type;

    @Column
    private String NameRestaurants;

    @Column
    private String country;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private Integer building;

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
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
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
