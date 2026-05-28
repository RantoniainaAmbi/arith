package com.example.demo.endpoint.rest.controller.health;

import com.example.demo.service.AddService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddController {
  private final AddService addService;

  @GetMapping("/add")
  public int add(@RequestParam int a, @RequestParam int b) {
    return addService.add(a, b);
  }
}
