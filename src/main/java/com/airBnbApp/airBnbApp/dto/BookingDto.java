package com.airBnbApp.airBnbApp.dto;

import com.airBnbApp.airBnbApp.entity.Guest;
import com.airBnbApp.airBnbApp.entity.Hotel;
import com.airBnbApp.airBnbApp.entity.Room;
import com.airBnbApp.airBnbApp.entity.User;
import com.airBnbApp.airBnbApp.entity.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
}
