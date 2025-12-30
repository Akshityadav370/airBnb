package com.airBnbApp.airBnbApp.strategy;

import com.airBnbApp.airBnbApp.entity.Inventory;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class OccupancyPricingStrategy implements PricingStrategy {
    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);
        double occupancyRate = (double) inventory.getBookedCount() /inventory.getTotalCount();

        if (occupancyRate > 0.8) {
            double MULTIPLY_FACTOR = 1.2;
            price = price.multiply(BigDecimal.valueOf(MULTIPLY_FACTOR));
        }
        return price;
    }
}
