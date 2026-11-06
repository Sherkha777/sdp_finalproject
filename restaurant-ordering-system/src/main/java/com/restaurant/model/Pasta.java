package com.restaurant.model;

public class Pasta implements Meal {
    @Override
    public String getName() {
        return "Pasta Carbonara";
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
