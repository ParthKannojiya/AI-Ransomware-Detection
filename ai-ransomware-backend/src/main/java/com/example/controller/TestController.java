package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    // GET API - To check if the API is working
    @GetMapping
    public ResponseEntity<String> testAPI() {
        return ResponseEntity.ok("Test API is working!");
    }

    // POST API - To receive JSON data
    @PostMapping("/your-api-endpoint")
    public ResponseEntity<String> testEndpoint(@RequestBody Map<String, String> request) {
        return ResponseEntity.ok("Received: " + request);
    }
}
