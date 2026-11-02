package com.restaurant.decorator;

import com.restaurant.model.Meal;

public class Bacon extends MealDecorator {
    public Bacon(Meal meal) {
        super(meal);
    }

    @Override
    public String getName() {
        return meal.getName() + " + bacon";
    }

    @Override
    public int getPrice() {
        return meal.getPrice() + 700;
    }
}
