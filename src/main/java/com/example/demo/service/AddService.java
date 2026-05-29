package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {
  public long add(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Negative numbers are not allowed");
    }
    return a + b;
  }
}
