package com.restaurant.model;

public enum OrderStatus {
    NEW,
    PLACED,
    PREPARING,
    READY,
    DELIVERED;

    public OrderStatus next() {
        return this == DELIVERED ? this : values()[ordinal() + 1];
    }
}
