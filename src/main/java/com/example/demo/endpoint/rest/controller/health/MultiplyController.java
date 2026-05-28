package com.example.demo.endpoint.rest.controller.health;

import com.example.demo.service.MultiplyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MultiplyController {
    private final MultiplyService multiplyService;

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return multiplyService.multiply(a, b);
    }
}
