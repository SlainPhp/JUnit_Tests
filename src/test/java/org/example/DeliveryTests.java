package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeliveryTests {

    @Test
    public void normalTest() {
        Delivery delivery = new Delivery(20, "small", true, "high");
        double result = delivery.deliveryCoast(delivery);
        double expected = 1400;
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void distanceAndFragilityTest() {
        Delivery delivery = new Delivery(40, "large", false, "normal");
        double result = delivery.deliveryCoast(delivery);
        double expected = 900;
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void highDistanceTest() {
        Delivery delivery = new Delivery(40, "large", false, "normal");
        Assertions.assertThrows(RuntimeException.class, () -> delivery.setFragility(true));
    }
    @Test
    public void nullDistanceTest() {
        Delivery delivery = new Delivery(20, "large", false, "normal");
        Assertions.assertThrows(RuntimeException.class, () -> delivery.setDistance(0));
    }
    @Test
    public void allValuesIsHigh() {
        Delivery delivery = new Delivery(40, "large", false, "very_high");
        double result = delivery.deliveryCoast(delivery);
        double expected = 1440;
        Assertions.assertEquals(expected, result);
    }
}
