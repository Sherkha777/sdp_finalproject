package com.restaurant.decorator;

import com.restaurant.model.Meal;

public abstract class MealDecorator implements Meal {
    protected final Meal meal;

    protected MealDecorator(Meal meal) {
        this.meal = meal;
    }
}
