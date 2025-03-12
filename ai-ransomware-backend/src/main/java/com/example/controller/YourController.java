package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/your-test")
public class YourController {

    @GetMapping
    public ResponseEntity<String> yourTestAPI() {
        return ResponseEntity.ok("Your API is working!");
    }
}
