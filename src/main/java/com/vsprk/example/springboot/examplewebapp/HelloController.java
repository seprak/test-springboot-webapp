package com.vsprk.example.springboot.examplewebapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Manny Greetings from Spring Boot! on " + System.getProperty("os.name");
    }

}