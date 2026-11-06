package com.restaurant.factory;

import com.restaurant.model.Meal;
import com.restaurant.model.Burger;

public class BurgerCreator extends MealCreator {
    @Override
    public Meal createMeal() {
        return new Burger();
    }
}
