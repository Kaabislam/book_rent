package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save-user")
    public User registerUser(@RequestBody User user){
       return userService.save(user);

    }

    @GetMapping("/users")
    public List<User> userList(){
        return userService.findall();

    }


}
