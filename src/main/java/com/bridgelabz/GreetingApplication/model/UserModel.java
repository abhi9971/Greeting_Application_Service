package com.bridgelabz.GreetingApplication.model;

public class UserModel {

    private String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public UserModel(String fname) {
        super();
        this.fname = fname;
    }
}