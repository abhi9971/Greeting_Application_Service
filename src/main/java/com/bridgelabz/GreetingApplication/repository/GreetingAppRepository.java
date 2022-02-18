package com.bridgelabz.GreetingApplication.repository;

import com.bridgelabz.GreetingApplication.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<UserModel, Integer> {

}
