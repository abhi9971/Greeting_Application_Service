package com.bridgelabz.GreetingApplication.controller;


import com.bridgelabz.GreetingApplication.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/start")
public class GreetingController {
    @Autowired
    GreetingAppService service;
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name",defaultValue = "world") String name) {
       String greeting= service.sayGreeting();
        return greeting;
    }

    @PostMapping("/post/{name}")
    public String greeting1(@PathVariable String name) {
        return "Hello..!!! " + name;
    }
}
