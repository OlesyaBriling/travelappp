package com.server.travelapp.restaurants.workingTime.weekends;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class WeekendsWorkingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String weekends_startwork;


    private String weekends_endwork;

}
