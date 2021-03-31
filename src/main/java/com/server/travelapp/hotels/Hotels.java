package com.server.travelapp.hotels;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Array;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Hotels {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String hotelName;

//    @Column
//    private String country;
//
//    @Column
//    private String city;
//
//    @Column
//    private String street;
//
//    @Column
//    private Integer building;

//    @Table
//    public class Rooms {
//
//        @Column
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//
//
//        @Column
//        private Integer priceAmount;
//
//    }



}
