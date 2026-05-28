package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {
  public int add(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Negative numbers are not allowed");
    }
    return a + b;
  }
}
