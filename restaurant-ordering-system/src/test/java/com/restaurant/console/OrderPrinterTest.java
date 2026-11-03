package com.restaurant.console;
import com.restaurant.factory.MealFactory;
import com.restaurant.model.MealType;
import com.restaurant.model.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
class OrderPrinterTest {
    private final MealFactory factory=new MealFactory();
    @Test
    void summaryListsMealsAndTotal(){
        Order order=new Order(3);
        order.addMeal(factory.createMeal(MealType.PIZZA));
        order.addMeal(factory.createMeal(MealType.DRINK));
        String text=OrderPrinter.format(order);
        assertTrue(text.contains("Order #3"));
        assertTrue(text.contains("Margherita pizza"));
        assertTrue(text.contains("Total: 4100"));
    }

    @Test
    void emptyOrderHasZeroTotal(){
        String text=OrderPrinter.format(new Order(1));
        assertTrue(text.contains("Total: 0"));
    }
}
