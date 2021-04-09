package com.server.travelapp.hotels;


import com.server.travelapp.hotels.address.AddressHotels;
import com.server.travelapp.hotels.rooms.Rooms;
import com.server.travelapp.hotels.workingTimeHotels.WorkingTimeHotels;
import com.server.travelapp.restaurants.workingTime.WorkingTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Array;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Hotels")
public class Hotels {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String hotelName;

    @OneToOne(cascade = CascadeType.ALL)
    private AddressHotels addressHotels;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotels_id")
    private List<Rooms> rooms;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "hotels_id")
    private WorkingTimeHotels workingTimeHotels;


}
