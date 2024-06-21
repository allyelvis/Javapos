package com.example.restaurant_pos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restaurant_posController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Restaurant_pos!";
    }
}
