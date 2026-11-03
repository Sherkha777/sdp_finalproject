package com.restaurant.model;
public enum OrderStatus {
    NEW,
    COOKING,
    READY,
    DELIVERED;
    public OrderStatus next(){
        if(this==DELIVERED)return DELIVERED;
        return values()[ordinal()+1];
    }
}
