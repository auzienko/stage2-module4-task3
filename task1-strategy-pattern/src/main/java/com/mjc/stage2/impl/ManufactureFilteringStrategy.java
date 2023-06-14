package com.mjc.stage2.impl;


import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;

import java.util.Locale;

public class ManufactureFilteringStrategy implements FilteringStrategy {
    private final String manufacture;

    public ManufactureFilteringStrategy(String manufacture) {
        this.manufacture = manufacture.toLowerCase(Locale.ROOT);
    }

    @Override
    public boolean filter(Product product) {
        if (product == null || product.getManufacture() == null) {
            return false;
        }
        String productLowerCase = product.getManufacture().toLowerCase();
        return manufacture.equals(productLowerCase);
    }
}
