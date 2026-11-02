package com.restaurant.service;

import com.restaurant.model.Order;
import com.restaurant.model.OrderStatus;
import com.restaurant.observer.CustomerNotifier;
import com.restaurant.observer.KitchenDisplay;
import com.restaurant.observer.OrderObserver;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderService {
    private final Map<Integer, Order> orders = new LinkedHashMap<>();
    private final OrderObserver kitchen = new KitchenDisplay();
    private final OrderObserver customer = new CustomerNotifier();
    private int nextId = 1;

    public Order createOrder(String customerName) {
        Order order = new Order(nextId++, customerName);
        order.subscribe(kitchen);
        order.subscribe(customer);
        return order;
    }

    public boolean placeOrder(Order order) {
        if (order.getMeals().isEmpty()) {
            return false;
        }
        orders.put(order.getId(), order);
        order.setStatus(OrderStatus.PLACED);
        return true;
    }

    public boolean advance(int id) {
        Order order = orders.get(id);
        if (order == null || order.getStatus() == OrderStatus.DELIVERED) {
            return false;
        }
        order.setStatus(order.getStatus().next());
        return true;
    }

    public Collection<Order> getOrders() {
        return orders.values();
    }
}
