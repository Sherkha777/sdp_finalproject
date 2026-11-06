package com.restaurant.factory;

import com.restaurant.model.Meal;
import com.restaurant.model.Pasta;

public class PastaCreator extends MealCreator {
    @Override
    public Meal createMeal() {
        return new Pasta();
    }
}
