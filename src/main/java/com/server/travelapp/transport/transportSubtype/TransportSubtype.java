package com.server.travelapp.transport.transportSubtype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransportSubtype {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String color;

    private String code;

    private String title;

}
