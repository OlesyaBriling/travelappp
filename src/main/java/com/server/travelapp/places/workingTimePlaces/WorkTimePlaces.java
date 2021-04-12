package com.server.travelapp.places.workingTimePlaces;

import com.server.travelapp.places.workingTimePlaces.weekdays.WorkTimePlacesWeekdays;
import com.server.travelapp.places.workingTimePlaces.weekends.WorkTimePlacesWeekends;
import com.server.travelapp.restaurants.workingTime.weekdays.WeekdaysWorkingTime;
import com.server.travelapp.restaurants.workingTime.weekends.WeekendsWorkingTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "WorkingTimePlaces")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class WorkTimePlaces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
  //  @JoinColumn(name = "id", referencedColumnName = "id")
    private WorkTimePlacesWeekdays workTimePlacesWeekdays;

    @OneToOne(cascade = CascadeType.ALL)
  //  @JoinColumn(name = "id", referencedColumnName = "id")
    private WorkTimePlacesWeekends workTimePlacesWeekends;

}