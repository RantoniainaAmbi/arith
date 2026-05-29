package com.example.demo.conf.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.demo.service.AddService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddServiceTest {
  @Autowired private AddService service;

  @Test
  void addShouldReturnSumForPositiveNumbers() {
    assertEquals(5, service.add(2, 3));
  }

  @Test
  void addShouldReturnSumForPositiveLongNumbers() {
    assertEquals(100_000_000_000L, service.add(50_000_000_000L, 50_000_000_000L));
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
