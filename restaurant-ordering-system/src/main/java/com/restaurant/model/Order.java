package com.restaurant.model;

import com.restaurant.observer.OrderObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final int id;
    private final String customerName;
    private final List<Meal> meals = new ArrayList<>();
    private final List<OrderObserver> observers = new ArrayList<>();
    private OrderStatus status = OrderStatus.NEW;

    public Order(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public int getTotal() {
        int total = 0;
        for (Meal meal : meals) {
            total += meal.getPrice();
        }
        return total;
    }

    public void subscribe(OrderObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        for (OrderObserver observer : observers) {
            observer.onStatusChanged(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Meal> getMeals() {
        return Collections.unmodifiableList(meals);
    }

    public OrderStatus getStatus() {
        return status;
    }
}
