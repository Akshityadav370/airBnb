package com.airBnbApp.airBnbApp.repository;

import com.airBnbApp.airBnbApp.entity.Hotel;
import com.airBnbApp.airBnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwner(User user);
}