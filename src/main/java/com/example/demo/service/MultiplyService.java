package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService {
    public int multiply(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a * b;
    }
}
