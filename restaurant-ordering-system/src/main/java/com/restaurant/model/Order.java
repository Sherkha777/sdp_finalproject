package com.restaurant.model;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private final int id;
    private final List<Meal> meals=new ArrayList<>();
    private OrderStatus status=OrderStatus.NEW;
    public Order(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void addMeal(Meal meal){
        meals.add(meal);
    }
    public List<Meal> getMeals(){
        return List.copyOf(meals);
    }
    public double getTotal(){
        double total=0;
        for(Meal meal:meals){
            total+=meal.getPrice();
        }
        return total;
    }
    public OrderStatus getStatus(){
        return status;
    }
    public void setStatus(OrderStatus status){
        this.status=status;
    }
}
