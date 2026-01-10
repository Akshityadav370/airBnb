package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.dto.BookingDto;
import com.airBnbApp.airBnbApp.dto.BookingRequest;
import com.airBnbApp.airBnbApp.dto.GuestDto;
import com.airBnbApp.airBnbApp.dto.HotelReportDto;
import com.stripe.model.Event;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(List<GuestDto> guestDtoList, Long bookingId);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    String getBookingStatus(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}
