package com.example.accounting_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Accounting_managementController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Accounting_management!";
    }
}
