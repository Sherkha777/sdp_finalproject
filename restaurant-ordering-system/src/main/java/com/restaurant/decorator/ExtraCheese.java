package com.restaurant.decorator;

import com.restaurant.model.Meal;

public class ExtraCheese extends MealDecorator {
    public ExtraCheese(Meal meal) {
        super(meal);
    }

    @Override
    public String getName() {
        return meal.getName() + " + extra cheese";
    }

    @Override
    public int getPrice() {
        return meal.getPrice() + 500;
    }
}
