package com.server.travelapp.hotels.workingTimeHotels.weekdays;

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
public class WeekdaysWorkingTimeHotels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String weekdays_startwork;

    private String weekdays_endwork;

}
