package com.server.travelapp.hotels.rooms;

import com.server.travelapp.hotels.rooms.beds.Beds;
import com.server.travelapp.hotels.rooms.comfots.Comforts;
import com.server.travelapp.hotels.rooms.price.PriceRooms;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Rooms")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.MERGE)
    private PriceRooms price;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "rooms_id")
    private List<Beds> beds;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "rooms_id")
    private List<Comforts> comforts;


}
