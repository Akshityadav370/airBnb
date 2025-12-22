package com.airBnbApp.airBnbApp.repository;

import com.airBnbApp.airBnbApp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}