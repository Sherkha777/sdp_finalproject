package com.restaurant.model;
public enum MealType {
    PIZZA("Pizza"),
    BURGER("Burger"),
    PASTA("Pasta"),
    DRINK("Drink");
    private final String title;
    MealType(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
}