package com.example.craftspeopleproducts.controller;

import com.example.craftspeopleproducts.entity.User;
import com.example.craftspeopleproducts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/login")
    public String login() {
        return "Login Page";
    }
}
