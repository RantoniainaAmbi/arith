package com.example.demo.conf.service;

import com.example.demo.service.DivideService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivideServiceTest {
    private final DivideService service = new DivideService();

    @Test
    void divideShouldReturnQuotientForPositiveNumbers() {
        assertEquals(2, service.divide(6, 3));
    }

    @Test
    void divideShouldThrowWhenDivisorIsZero() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(5, 0));
    }

    @Test
    void divideShouldThrowWhenOneArgumentIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(-6, 2));
    }
}
