package com.example.controller; // Ye package structure sahi hona chahiye

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Ye base path hai
public class Mycontrol {  // Class name Mycontrol hi hona chahiye agar file ka naam Mycontrol.java hai

    @GetMapping("/hello") // URL: http://localhost:9090/api/hello
    public String sayHello() {
        return "Hello, World!";
    }
}
