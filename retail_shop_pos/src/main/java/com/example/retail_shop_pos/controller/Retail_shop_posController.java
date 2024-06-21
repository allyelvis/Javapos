package com.example.retail_shop_pos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Retail_shop_posController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Retail_shop_pos!";
    }
}
