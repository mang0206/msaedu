package com.example.microservice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class firstController {
  @GetMapping("/first")
  public String hello(Model model) {
    model.addAttribute("data", "String Cloud 로 구현하는 마이크로서비스");
    return "firstView";
  }
}
