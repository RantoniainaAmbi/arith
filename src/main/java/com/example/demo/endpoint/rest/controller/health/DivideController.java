package com.example.demo.endpoint.rest.controller.health;

import com.example.demo.service.DivideService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DivideController {
    private final DivideService divideService;

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        return divideService.divide(a, b);
    }
}
