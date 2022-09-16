package com.library.librarymanagementsystem.controller;

import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.service.UserService;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user){
        return userService.createUser(user);

    }
    @GetMapping("/users")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }
    @GetMapping("/users/{userId}")
    public Optional<User>getUserById(@PathVariable("userId") Long userId){
        Optional<User> user=userService.getUserById(userId);
        if(user.isPresent()){
            return user;
        }else{
            throw new ResourceNotFoundException("User Not found with given Id:"+userId);
        }

    }
    @PutMapping("/users/{userId}")
    public ResponseEntity<User>updateUser(@PathVariable long userId,@RequestBody User user){
        return  userService.getUserById(userId).map(u-> {
            u.setUserName(user.getUserName());
            u.setAge(user.getAge());
            u.setGender(user.getGender());
            u.setMobileNo(user.getMobileNo());
            u.setEmail(user.getEmail());
            u.setAddress(user.getAddress());
            User userUpdate = userService.updateUser(u);
            return new ResponseEntity<>(userUpdate, HttpStatus.OK);
        }).orElseGet(()->ResponseEntity.notFound().build());
    }
    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable long userId){
        var user=userService.getUserById(userId)
                .orElseThrow(()->new ResourceNotFoundException("User Not found with given Id:"+userId));
        userService.deleteUser(userId);
    }
    @PatchMapping("users/status/{userId}")
    public ResponseEntity<User>updateUserStatus(@PathVariable long userId,@RequestBody User patchUser){
        return  userService.getById(userId).map(u-> {
            u.setStatus(patchUser.getStatus());
            User userUpdate = userService.updateUser(u);
            return new ResponseEntity<>(userUpdate, HttpStatus.OK);
        }).orElseGet(()->ResponseEntity.notFound().build());
    }


}
