package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle source = event.getSource();
        double square = source.getSideA() * source.getSideB();
        double perimeter = 2 * (source.getSideA() + source.getSideB());
        RectangleValues rectangleValues = new RectangleValues(square, perimeter);
        RectangleWarehouse.getInstance().put(source.getId(), rectangleValues);
    }
}
