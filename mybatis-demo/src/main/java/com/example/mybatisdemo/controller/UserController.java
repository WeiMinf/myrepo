package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @GetMapping("/findUser/{id}/{name}")
    public User findUser(@PathVariable Integer id, @PathVariable String name) {
        return userService.findUser(id, name);
    }

    @GetMapping("/findUser2/{id}/{name}")
    public User findUser2(@PathVariable Integer id, @PathVariable String name) {
        return userService.findUser2(id, name);
    }
}
