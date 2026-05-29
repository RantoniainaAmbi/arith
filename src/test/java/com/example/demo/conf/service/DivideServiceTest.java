package com.example.demo.conf.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.demo.service.DivideService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DivideServiceTest {
  @Autowired private DivideService service;

  @Test
  void divideShouldReturnQuotientForPositiveNumbers() {
    assertEquals(2, service.divide(6, 3));
  }

  @Test
  void divideShouldReturnQuotientForLongNumbers() {
    assertEquals(2, service.divide(100_000_000_000L, 50_000_000_000L));
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
