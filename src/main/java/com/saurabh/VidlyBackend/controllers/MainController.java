package com.saurabh.VidlyBackend.controllers;

import com.saurabh.VidlyBackend.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.ArrayList;

@RestController
public class MainController {

    @GetMapping("/home")
    public String homePage(){
        System.out.println("Home called...");
        return "This is home page!!";
    }

    @GetMapping("/users")
    public ArrayList<User> allUsers(){
        return new ArrayList<User>();
    }
}
