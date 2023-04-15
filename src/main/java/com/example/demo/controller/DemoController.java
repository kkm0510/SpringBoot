package com.example.demo.controller;

import com.example.demo.dto.WelcomeClass;
import com.example.demo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping(value = "welcome")
    public WelcomeClass getWelcome(){
        return welcomeService.getWelcomeMessage();
    }

}
