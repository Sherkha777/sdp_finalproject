package com.restaurant.decorator;

import com.restaurant.model.Meal;

public class Mushrooms extends MealDecorator {
    public Mushrooms(Meal meal) {
        super(meal);
    }

    @Override
    public String getName() {
        return meal.getName() + " + mushrooms";
    }

    @Override
    public int getPrice() {
        return meal.getPrice() + 400;
    }
}
