package com.bridgelabz.GreetingApplication.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/start")
public class GreetingController {


    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name",defaultValue = "world") String name) {
        return "Hello..!!! " + name;
    }

    @PostMapping("/post/{name}")
    public String greeting1(@PathVariable String name) {
        return "Hello..!!! " + name;
    }
}