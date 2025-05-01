package com.example.project_one;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // Endpoint to return a greeting message
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
