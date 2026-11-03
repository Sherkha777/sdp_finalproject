package com.restaurant.factory;
import com.restaurant.model.Burger;
import com.restaurant.model.Drink;
import com.restaurant.model.Meal;
import com.restaurant.model.MealType;
import com.restaurant.model.Pasta;
import com.restaurant.model.Pizza;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
class MealFactoryTest {
    private final MealFactory factory=new MealFactory();
    @Test
    void createsMealOfRequestedType(){
        assertInstanceOf(Pizza.class,factory.createMeal(MealType.PIZZA));
        assertInstanceOf(Burger.class,factory.createMeal(MealType.BURGER));
        assertInstanceOf(Pasta.class,factory.createMeal(MealType.PASTA));
        assertInstanceOf(Drink.class,factory.createMeal(MealType.DRINK));
    }
    @Test
    void everyMealTypeHasPositivePrice(){
        for(MealType type:MealType.values()){
            Meal meal=factory.createMeal(type);
            assertTrue(meal.getPrice()>0);
        }
    }

    @Test
    void eachCallReturnsNewObject(){
        assertNotSame(factory.createMeal(MealType.PIZZA),factory.createMeal(MealType.PIZZA));
    }
}
