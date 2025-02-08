package com.praveen.trello.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AppController {

    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        Map<String, String> status = new HashMap<>();
        status.put("status", "UP");
        status.put("message", "Application is running smoothly");
        return status;
    }

    @GetMapping("/")
    public Map<String, String> welcomeMessage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to the Billing App API!");
        return response;
    }
}
