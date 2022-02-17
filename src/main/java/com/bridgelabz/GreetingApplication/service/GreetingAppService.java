package com.bridgelabz.GreetingApplication.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
    public String sayGreeting() {
        return "Hello world";
    }
}
