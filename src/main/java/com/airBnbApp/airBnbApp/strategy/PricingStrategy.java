package com.airBnbApp.airBnbApp.strategy;

import com.airBnbApp.airBnbApp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
