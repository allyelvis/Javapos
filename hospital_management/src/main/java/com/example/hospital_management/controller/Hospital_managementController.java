package com.example.hospital_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hospital_managementController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Hospital_management!";
    }
}
