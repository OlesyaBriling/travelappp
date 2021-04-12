package com.server.travelapp.hotels.comfortsHotel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

    @Entity
    @Table(name = "Comforts_hotel")
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public class ComfortsHotel {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String name;
    }


