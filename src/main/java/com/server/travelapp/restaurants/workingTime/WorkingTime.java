package com.server.travelapp.restaurants.workingTime;

import com.server.travelapp.restaurants.workingTime.weekdays.WeekdaysWorkingTime;
import com.server.travelapp.restaurants.workingTime.weekends.WeekendsWorkingTime;
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
public class WorkingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
   private WeekdaysWorkingTime weekdaysWorkingTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
   private WeekendsWorkingTime weekendsWorkingTime;

}
