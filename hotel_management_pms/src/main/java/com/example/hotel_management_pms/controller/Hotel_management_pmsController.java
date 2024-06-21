package com.example.hotel_management_pms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotel_management_pmsController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Hotel_management_pms!";
    }
}
