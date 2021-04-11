package com.server.travelapp.routes.waypoints.amountSpent;

import com.server.travelapp.routes.waypoints.amountSpent.amountSpentAny.HotelsAmountSpent;
import com.server.travelapp.routes.waypoints.amountSpent.amountSpentAny.PlacesAmountSpent;
import com.server.travelapp.routes.waypoints.amountSpent.amountSpentAny.RestaurantsAmountSpent;
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

    @OneToOne(cascade = CascadeType.ALL)
    private RestaurantsAmountSpent restaurantsAmountSpent;

    @OneToOne(cascade = CascadeType.ALL)
    private HotelsAmountSpent hotelsAmountSpent;

    @OneToOne(cascade = CascadeType.ALL)
    private PlacesAmountSpent placesAmountSpent;









}
