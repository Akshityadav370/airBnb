package com.airBnbApp.airBnbApp.repository;

import com.airBnbApp.airBnbApp.entity.Inventory;
import com.airBnbApp.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByRoom(Room room);
}