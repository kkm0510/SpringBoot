package com.example.demo.service;

import com.example.demo.dto.WelcomeClass;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public WelcomeClass getWelcomeMessage() {
        return new WelcomeClass("Welcome to spring");
    }
}
