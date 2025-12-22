package com.airBnbApp.airBnbApp.controller;

import com.airBnbApp.airBnbApp.dto.BookingDto;
import com.airBnbApp.airBnbApp.dto.BookingRequest;
import com.airBnbApp.airBnbApp.dto.GuestDto;
import com.airBnbApp.airBnbApp.service.BookingService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class HotelBookingController {
    private final BookingService bookingService;

    @PostMapping("/init")
    public ResponseEntity<BookingDto> initialiseBooking(@RequestBody BookingRequest bookingRequest) {
        return ResponseEntity.ok(bookingService.initialiseBooking(bookingRequest));
    }

    @PostMapping("/{bookingId}/addGuests")
    public ResponseEntity<BookingDto> addGuests(@PathVariable Long bookingId,
                                                @RequestBody List<GuestDto> guestDtoList) {
        return ResponseEntity.ok(bookingService.addGuests(guestDtoList, bookingId));
    }
}
