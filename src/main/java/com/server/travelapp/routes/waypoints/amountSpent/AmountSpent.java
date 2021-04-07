package com.server.travelapp.routes.waypoints.amountSpent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Table(name = "amount_spent")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AmountSpent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer totalAmount;

    private String currency;








}
