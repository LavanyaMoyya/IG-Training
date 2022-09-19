package com.library.librarymanagementsystem.service;

import com.library.librarymanagementsystem.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User createUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getUserById(Long userId);
    public User updateUser(User user);
    public void deleteUser(long userId);
    public User updateUserStatus(User user);
    public Optional<User> getById(Long userId);

}
