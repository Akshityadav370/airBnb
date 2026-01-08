package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.entity.Booking;

public interface CheckoutService {
    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);
}
