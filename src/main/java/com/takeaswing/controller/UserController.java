package com.takeaswing.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeaswing.model.User;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Deep", "Mondal", "d23@gmail.com", "1234"));
        users.add(0, new User("John", "Doe", "john@gmail.com", "1234"));
        return users;
    }
}
