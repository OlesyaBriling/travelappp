package com.server.travelapp.hotels.rooms.comfots;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Comforts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comforts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
