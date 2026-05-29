package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SubstractService {
  public long substract(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Negative numbers are not allowed");
    }
    if (a < b) {
      throw new IllegalArgumentException("a cannot be inferior to b");
    }
    return a - b;
  }
}
