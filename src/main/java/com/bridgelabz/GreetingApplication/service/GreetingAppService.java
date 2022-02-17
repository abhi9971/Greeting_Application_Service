package com.bridgelabz.GreetingApplication.service;

import com.bridgelabz.GreetingApplication.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
    public String sayGreeting(UserModel user) {
        return "Hello..." + user.getFirstName() + " " + user.getLastName();
    }

    public String sayGreeting(String name) {
        return "Hello..!! " + name;
    }
}