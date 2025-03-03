package com.example.beanstalk.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    public String getMethodName() {
        return new String("First Beanstalk deployment application with java");
    }
    
}