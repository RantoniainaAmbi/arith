package com.example.demo.conf.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.demo.service.MultiplyService;
import org.junit.jupiter.api.Test;

class MultiplyServiceTest {
  private final MultiplyService service = new MultiplyService();

  @Test
  void multiplyShouldReturnProductForPositiveNumbers() {
    assertEquals(12, service.multiply(3, 4));
  }

  @Test
  void multiplyShouldReturnZeroWhenOneOperandIsZero() {
    assertEquals(0, service.multiply(5, 0));
  }

  @Test
  void multiplyShouldThrowWhenOneArgumentIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> service.multiply(-2, 5));
  }
}
