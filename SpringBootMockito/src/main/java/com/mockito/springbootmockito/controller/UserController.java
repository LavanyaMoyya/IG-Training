package com.mockito.springbootmockito.controller;

import com.mockito.springbootmockito.model.User;
import com.mockito.springbootmockito.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value="/save")
    public User saveUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/getUsers")
    public List<User>findAllUsers(){
        return userService.getUsers();
    }
    @GetMapping("/getUserByAddress/{address}")
    public List<User> findUserByAddress(@PathVariable String address){
        return userService.getUserByAddress(address);
    }
    @DeleteMapping(value="/remove")
    public User removeUser(@RequestBody User user){
        userService.deleteUser(user);
        return user;
    }

    }

