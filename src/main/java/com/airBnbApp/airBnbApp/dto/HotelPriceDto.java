package com.airBnbApp.airBnbApp.dto;

import com.airBnbApp.airBnbApp.entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelPriceDto {

    private Hotel hotel;
    private Double avgPrice;
}
