package com.airBnbApp.airBnbApp.repository;

import com.airBnbApp.airBnbApp.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}