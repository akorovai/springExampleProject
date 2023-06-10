package com.akorovai.springboot.ticket_booking_app.Repository;

import com.akorovai.springboot.ticket_booking_app.Entities.Reservation;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
