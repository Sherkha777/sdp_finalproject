package com.restaurant.factory;

import com.restaurant.model.Meal;
import com.restaurant.model.Pizza;

public class PizzaCreator extends MealCreator {
    @Override
    public Meal createMeal() {
        return new Pizza();
    }
}
