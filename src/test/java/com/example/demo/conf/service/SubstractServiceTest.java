package com.example.demo.conf.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.demo.service.SubstractService;
import org.junit.jupiter.api.Test;

class SubstractServiceTest {
  private final SubstractService service = new SubstractService();

  @Test
  void substractShouldReturnDifferenceForValidInput() {
    assertEquals(4, service.substract(7, 3));
  }

  @Test
  void substractShouldThrowWhenFirstOperandIsSmallerThanSecond() {
    assertThrows(IllegalArgumentException.class, () -> service.substract(2, 5));
  }

  @Test
  void substractShouldThrowWhenOneArgumentIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> service.substract(7, -3));
  }
}
