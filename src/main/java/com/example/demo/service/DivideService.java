package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DivideService {
  public int divide(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Negative numbers are not allowed");
    }
    if (b == 0) {
      throw new IllegalArgumentException("Division by 0 is impossible");
    }
    return a / b;
  }
}
