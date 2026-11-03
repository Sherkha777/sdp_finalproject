package com.restaurant.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class OrderStatusTest {
    @Test
    void nextMovesThroughAllStatuses(){
        assertEquals(OrderStatus.COOKING,OrderStatus.NEW.next());
        assertEquals(OrderStatus.READY,OrderStatus.COOKING.next());
        assertEquals(OrderStatus.DELIVERED,OrderStatus.READY.next());
    }

    @Test
    void deliveredStaysDelivered(){
        assertEquals(OrderStatus.DELIVERED,OrderStatus.DELIVERED.next());
    }
}
