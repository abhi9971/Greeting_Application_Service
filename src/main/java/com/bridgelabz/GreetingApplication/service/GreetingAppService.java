package com.bridgelabz.GreetingApplication.service;

import com.bridgelabz.GreetingApplication.model.UserModel;
import com.bridgelabz.GreetingApplication.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
    @Autowired
    GreetingAppRepository repo;
    public String sayGreeting(UserModel user) {
        return "Hello..." + user.getFirstName() + " " + user.getLastName();
    }

    public String sayGreeting(String name) {
        return "Hello..!! " + name;
    }

    public UserModel getGreeting(UserModel user) {
        repo.save(user);
        return user;
    }
}