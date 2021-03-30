package com.server.travelapp.places;

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
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String placeName;

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



    @Override
    public String toString() {
        return "Places { " +
                "id=" + id +
                ", placeName='" + placeName + '\'' +
                "Address {" +
                "  country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                "}" +
                "workingTime {" +
                "  startwork='" + weekdays_startwork + '\'' +
                ", endwork='" + weekdays_endwork + '\'' + "}" +
                '}';
    }
}
