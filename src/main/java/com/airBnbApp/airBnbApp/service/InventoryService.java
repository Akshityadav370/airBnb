package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.dto.HotelDto;
import com.airBnbApp.airBnbApp.dto.HotelPriceDto;
import com.airBnbApp.airBnbApp.dto.HotelSearchRequestDto;
import com.airBnbApp.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    public void initializeRoomForAYear(Room room);

    public void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequestDto hotelSearchRequest);
}
