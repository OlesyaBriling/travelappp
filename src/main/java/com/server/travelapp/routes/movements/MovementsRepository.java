package com.server.travelapp.routes.movements;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementsRepository extends JpaRepository<Movements, Long> {
}
