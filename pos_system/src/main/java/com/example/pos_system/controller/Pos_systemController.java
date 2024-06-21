package com.example.pos_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pos_systemController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Pos_system!";
    }
}
