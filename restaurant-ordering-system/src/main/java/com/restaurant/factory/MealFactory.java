package com.restaurant.factory;
import com.restaurant.model.Burger;
import com.restaurant.model.Drink;
import com.restaurant.model.Meal;
import com.restaurant.model.MealType;
import com.restaurant.model.Pasta;
import com.restaurant.model.Pizza;
public class MealFactory {
    public Meal createMeal(MealType type){
        return switch(type){
            case PIZZA -> new Pizza();
            case BURGER -> new Burger();
            case PASTA -> new Pasta();
            case DRINK -> new Drink();
        };
    }
}
