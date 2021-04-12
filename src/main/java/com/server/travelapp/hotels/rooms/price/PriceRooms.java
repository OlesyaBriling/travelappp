package com.server.travelapp.hotels.rooms.price;

import com.server.travelapp.customsum.Customsum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PriceRooms")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PriceRooms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer amount;

    private String currency;

}
