package com.restaurant.model;

public class Pizza implements Meal {
    @Override
    public String getName() {
        return "Margherita Pizza";
    }

    @Override
    public int getPrice() {
        return 3500;
    }
}
