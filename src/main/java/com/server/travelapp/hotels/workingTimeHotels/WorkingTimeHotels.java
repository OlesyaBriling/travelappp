package com.server.travelapp.hotels.workingTimeHotels;

import com.server.travelapp.hotels.workingTimeHotels.weekdays.WeekdaysWorkingTimeHotels;
import com.server.travelapp.hotels.workingTimeHotels.weekends.WeekendsWorkingTimeHotels;
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
public class WorkingTimeHotels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
   private WeekdaysWorkingTimeHotels weekdaysWorkingTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
   private WeekendsWorkingTimeHotels weekendsWorkingTime;

}
