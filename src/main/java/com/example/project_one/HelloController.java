package com.example.project_one;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //This is a comment added from the github website!
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
