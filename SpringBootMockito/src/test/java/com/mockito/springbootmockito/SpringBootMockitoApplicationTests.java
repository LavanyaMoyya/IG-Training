package com.mockito.springbootmockito;

import com.mockito.springbootmockito.model.User;
import com.mockito.springbootmockito.repository.UserRepository;
import com.mockito.springbootmockito.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootMockitoApplicationTests {
    @Autowired
private UserService userService;
    @MockBean
private UserRepository userRepository;
@Test
    public void getUsersTest(){
        when(userRepository.findAll()).thenReturn(Stream.of(new User(111,"Lavanya",28,"Vijayawada"),
                new User(222,"Srikanth",31,"Hyderabad")).collect(Collectors.toList()));
        assertEquals(2,userService.getUsers().size());
    }
@Test
    public void getUserByAddressTest(){
    String address="Banglore";
    when(userRepository.findByAddress(address)).thenReturn(Stream.of(new User(111,"Lavanya",28,"Vijayawada")).collect(Collectors.toList()));
    assertEquals(1,userService.getUserByAddress(address).size());
    }

    @Test
    public void saveUserTest(){
    User user=new User(333,"Bhuvi",24,"Pune");
    when(userRepository.save(user)).thenReturn(user);
    assertEquals(user,userService.addUser(user));
    }

    @Test
    public void deleteUserTest(){
        User user=new User(333,"Bhuvi",24,"Pune");
        userService.deleteUser(user);
        verify(userRepository,times(1)).delete(user);
    }


}
