package com.server.travelapp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
class Places {

    @Column

    private String placeName;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Override
    public String toString() {
        return "Places{" +
                "placeName='" + placeName + '\'' +
                ", id=" + id +
                '}';
    }
}
