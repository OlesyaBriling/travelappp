package com.server.travelapp.transport.searchInfo;

import com.server.travelapp.transport.searchPlace.SearchPlace;
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
public class SearchInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String date;

    @OneToOne(cascade = CascadeType.ALL)
    private SearchPlace from;

    @OneToOne(cascade = CascadeType.ALL)
    private SearchPlace to;
}
