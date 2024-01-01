package com.example.mp127.repository;

import com.example.mp127.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByBookingId(Long id);
}
