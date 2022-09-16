package com.library.librarymanagementsystem.repository;

import com.library.librarymanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{
    public Optional<User> findByEmail(String email);
    @Query(value = "select * from User u where u.status='Active'", nativeQuery = true)
    public List<User> getAllActiveUsers();
    @Query(value = "select * from User u where u.status='InActive'", nativeQuery = true)
    public List<User> getAllInActiveUsers();
    @Query(value = "select * from User u where u.status='Active' and u.userid=?", nativeQuery = true)
    public Optional<User>getActiveUserById(@Param(value="userId") Long uId);
    @Query(value = "select * from User u where u.status='InActive' and u.userid=?", nativeQuery = true)
    public Optional<User>getInActiveUserById(@Param(value="userId") Long uId);



}
