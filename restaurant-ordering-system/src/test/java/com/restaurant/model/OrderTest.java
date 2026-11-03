package com.restaurant.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class OrderTest {
    private static class TestMeal implements Meal {
        private final String name;
        private final double price;
        TestMeal(String name,double price){
            this.name=name;
            this.price=price;
        }
        @Override
        public String getName(){
            return name;
        }
        @Override
        public String getDescription(){
            return name;
        }
        @Override
        public double getPrice(){
            return price;
        }
    }
    @Test
    void newOrderIsEmptyWithNewStatus(){
        Order order=new Order(1);
        assertEquals(0,order.getTotal(),0.001);
        assertEquals(OrderStatus.NEW,order.getStatus());
    }
    @Test
    void totalIsSumOfMealPrices(){
        Order order=new Order(1);
        order.addMeal(new TestMeal("Pizza",3500));
        order.addMeal(new TestMeal("Cola",600));
        assertEquals(4100,order.getTotal(),0.001);
    }
}
