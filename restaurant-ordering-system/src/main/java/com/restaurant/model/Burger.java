package com.restaurant.model;

public class Burger implements Meal {
    @Override
    public String getName() {
        return "Beef Burger";
    }

    @Override
    public int getPrice() {
        return 2800;
    }
}
