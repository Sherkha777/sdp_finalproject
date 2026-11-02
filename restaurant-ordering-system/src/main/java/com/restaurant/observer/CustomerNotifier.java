package com.restaurant.observer;

import com.restaurant.model.Order;

public class CustomerNotifier implements OrderObserver {
    @Override
    public void onStatusChanged(Order order) {
        String message = switch (order.getStatus()) {
            case PLACED -> "we got your order #" + order.getId();
            case PREPARING -> "your order is being prepared";
            case READY -> "your order is ready";
            case DELIVERED -> "enjoy your meal!";
            default -> null;
        };
        if (message != null) {
            System.out.println("[Customer " + order.getCustomerName() + "] " + message);
        }
    }
}
