package com.server.travelapp.hotels.rooms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

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
    private Integer priceAmount;


}
