package com.airBnbApp.airBnbApp.service;

import com.airBnbApp.airBnbApp.entity.Inventory;
import com.airBnbApp.airBnbApp.strategy.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PricingServiceImply implements PricingService{

    @Override
    public BigDecimal calculateDynamicPricing(Inventory inventory) {
        PricingStrategy pricingStrategy = new BasePricingStrategy();

        // apply the additional strategies
        pricingStrategy = new SurgePricingStrategy(pricingStrategy);
        pricingStrategy = new OccupancyPricingStrategy(pricingStrategy);
        pricingStrategy = new UrgencyPricingStrategy(pricingStrategy);
        pricingStrategy = new HolidayPricingStrategy(pricingStrategy);

        return pricingStrategy.calculatePrice(inventory);
    }
}
