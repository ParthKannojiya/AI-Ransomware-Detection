package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.RansomwareLog;
import com.example.service.RansomwareLogService;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class RansomwareLogController {

    @Autowired
    private RansomwareLogService service;

    @GetMapping
    public List<RansomwareLog> getAllLogs() {
        return service.getAllLogs();
    }

    @PostMapping
    public RansomwareLog createLog(@RequestBody RansomwareLog log) {
        return service.saveLog(log);
    }
}
