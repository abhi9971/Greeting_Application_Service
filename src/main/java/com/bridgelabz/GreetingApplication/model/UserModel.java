package com.bridgelabz.GreetingApplication.model;

public class UserModel {

    private String firstName;
    private String lastName;

public UserModel(){}
public UserModel(String firstName,String lastName){
    super();
    this.firstName=firstName;
    this.lastName=lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return  lastName;
    }
    public String getFirstName(){
        return firstName;
    }
}


