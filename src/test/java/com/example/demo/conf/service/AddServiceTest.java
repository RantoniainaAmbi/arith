package com.example.demo.conf.service;

import com.example.demo.service.AddService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AddServiceTest {
    private final AddService service = new AddService();

    @Test
    void addShouldReturnSumForPositiveNumbers() {
        assertEquals(5, service.add(2, 3));
    }

    @Test
    void addShouldThrowWhenOneArgumentIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> service.add(-1, 3));
    }

    @Test
    void addShouldThrowWhenBothArgumentsAreNegative() {
        assertThrows(IllegalArgumentException.class, () -> service.add(-2, -4));
    }
}
