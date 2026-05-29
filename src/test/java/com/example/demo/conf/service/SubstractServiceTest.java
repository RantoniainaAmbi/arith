package com.example.demo.conf.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.demo.service.SubstractService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubstractServiceTest {
  @InjectMocks private SubstractService service;

  @Test
  void substractShouldReturnDifferenceForValidInput() {
    assertEquals(4, service.substract(7, 3));
  }

  @Test
  void substractShouldReturnDifferenceForLongNumbers() {
    assertEquals(20_000_000_000L, service.substract(50_000_000_000L, 30_000_000_000L));
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
