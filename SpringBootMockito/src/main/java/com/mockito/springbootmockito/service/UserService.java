package com.mockito.springbootmockito.service;

import com.mockito.springbootmockito.model.User;
import com.mockito.springbootmockito.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){

        return userRepository.save(user);
    }
    public List<User> getUsers(){
        List<User> users=userRepository.findAll();
        System.out.println("Getting data from DB: "+users);
        return users;
    }
    public List<User> getUserByAddress(String address){
        return userRepository.findByAddress(address);
    }
    public void deleteUser(User user){
        userRepository.delete(user);
    }
}
