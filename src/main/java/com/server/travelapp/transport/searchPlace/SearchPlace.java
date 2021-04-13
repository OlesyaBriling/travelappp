package com.server.travelapp.transport.searchPlace;

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
public class SearchPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String type;

    private String title;

}
