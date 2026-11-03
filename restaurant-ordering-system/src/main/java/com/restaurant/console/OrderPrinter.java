package com.restaurant.console;
import com.restaurant.model.Meal;
import com.restaurant.model.Order;
public final class OrderPrinter {
    private OrderPrinter(){}
    public static String format(Order order){
        StringBuilder text=new StringBuilder();
        text.append(String.format("Order #%d [%s]%n",order.getId(),order.getStatus()));
        for(Meal meal:order.getMeals()){
            text.append(String.format("  %-55s %6.0f%n",meal.getDescription(),meal.getPrice()));
        }
        text.append(String.format("Total: %.0f%n",order.getTotal()));
        return text.toString();
    }
}
