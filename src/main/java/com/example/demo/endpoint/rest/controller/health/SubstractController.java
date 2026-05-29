package com.example.demo.endpoint.rest.controller.health;

import com.example.demo.service.SubstractService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SubstractController {
  private final SubstractService substractService;

  @GetMapping("/substract")
  public long substract(@RequestParam long a, @RequestParam long b) {
    return substractService.substract(a, b);
  }
}
