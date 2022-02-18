package com.bridgelabz.GreetingApplication.controller;


import com.bridgelabz.GreetingApplication.model.UserModel;
import com.bridgelabz.GreetingApplication.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/start")
public class GreetingController {

    @Autowired
    GreetingAppService service;


    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "userPassedName",defaultValue = "world") String userPassedName) {
        String greeting = service.sayGreeting(userPassedName);
        return greeting;
    }

    @PostMapping("/post")
    public String greeting1(@RequestBody UserModel user) {
        service.getGreeting(user);
        return 	service.sayGreeting(user);
    }
}