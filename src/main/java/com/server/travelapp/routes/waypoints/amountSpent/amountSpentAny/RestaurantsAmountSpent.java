package com.server.travelapp.routes.waypoints.amountSpent.amountSpentAny;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "restaurants_amount_spent")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RestaurantsAmountSpent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer amount;

    private String currency;
}
