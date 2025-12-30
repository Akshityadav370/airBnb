package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingService {
    BigDecimal calculateDynamicPricing(Inventory inventory);
    public void updatePrices();
}
