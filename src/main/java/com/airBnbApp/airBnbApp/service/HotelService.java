package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.dto.HotelDto;
import com.airBnbApp.airBnbApp.entity.Booking;
import com.airBnbApp.airBnbApp.entity.Hotel;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);
}
