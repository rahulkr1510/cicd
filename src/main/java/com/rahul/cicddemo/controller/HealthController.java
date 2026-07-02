package com.rahul.cicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Welcome to CI/CD Demo App";
    }

    @GetMapping("/health")
    public String health() {
        return "CI/CD Demo App v2 is running";

    }
}