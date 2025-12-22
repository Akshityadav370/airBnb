package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.dto.BookingDto;
import com.airBnbApp.airBnbApp.dto.BookingRequest;
import com.airBnbApp.airBnbApp.dto.GuestDto;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(List<GuestDto> guestDtoList, Long bookingId);
}
