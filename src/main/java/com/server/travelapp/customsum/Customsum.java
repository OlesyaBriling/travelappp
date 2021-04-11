package com.server.travelapp.customsum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "Customsum")
@NoArgsConstructor
@AllArgsConstructor
public class Customsum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer amount;

    private String currency;
}
