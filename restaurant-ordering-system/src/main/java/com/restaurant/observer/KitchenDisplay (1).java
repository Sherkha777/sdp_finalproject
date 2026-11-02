package com.restaurant.observer;

import com.restaurant.model.Meal;
import com.restaurant.model.Order;
import com.restaurant.model.OrderStatus;

public class KitchenDisplay implements OrderObserver {
    @Override
    public void onStatusChanged(Order order) {
        System.out.println("[Kitchen] Order #" + order.getId() + " is " + order.getStatus());
        if (order.getStatus() == OrderStatus.PLACED) {
            for (Meal meal : order.getMeals()) {
                System.out.println("[Kitchen]   - " + meal.getName());
            }
        }
    }
}
