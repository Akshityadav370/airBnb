package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.entity.Room;

public interface InventoryService {

    public void initializeRoomForAYear(Room room);

    public void deleteFutureInventories(Room room);
}
