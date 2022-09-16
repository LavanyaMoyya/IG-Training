package com.lavanya.service;

import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.repository.UserRepository;
import com.library.librarymanagementsystem.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;
    private User user;

    @BeforeEach
    public void setUpUser(){
        user=User.builder().userName("Lavanya").age(28).email("lavanyamoyya3@gmail.com")
                .gender("Female").mobileNo(8096343303L).address("Vijayawada").userType("Student").build();

    }
    @DisplayName("Junit Test for Save User")
    @Test
    public void givenUserObject_whenSave_thenReturnUserObject(){
        BDDMockito.given(userRepository.save(user)).willReturn(user);
        User savedUser=userService.createUser(user);
        assertThat(savedUser).isNotNull();
    }
    @DisplayName("Junit Test for Save User throw an exception")
    @Test
    public void  givenUserObject_whenSave_thenThrowException(){
        BDDMockito.given(userRepository.findByEmail(user.getEmail())).willReturn(Optional.of(user));
        assertThrows(ResourceNotFoundException.class,()->{
            userService.createUser(user);
        });
        verify(userRepository,never()).save(any(User.class));
    }
    @DisplayName("Junit Test for get All Users")
    @Test
    public void givenUserObject_whenGetAllUser_thenReturnUserList(){
        BDDMockito.given(userRepository.findAll()).willReturn(Collections.singletonList(user));
        List<User>userList=userService.getAllUsers();
        assertThat(userList).isNotNull();
        assertThat(userList.size()).isGreaterThan(1);
    }
    @DisplayName("Junit Test for get User by Id")
    @Test
    public void givenUserObject_whenFindById_thenReturnUserObject(){
        BDDMockito.given(userRepository.findById(user.getUserid())).willReturn(Optional.of(user));
        User savedUser =userService.getUserById(user.getUserid()).get();
        assertThat(savedUser).isNotNull();
    }
    @DisplayName("Junit Test for Update User")
    @Test
    public void givenUserObject_whenUpdateUser_thenReturnUserObject(){
        BDDMockito.given(userRepository.save(user)).willReturn(user);
        user.setUserName("Lavanya Moyya");
        user.setEmail("moyya.lavanya@hcl.com");
        user.setAddress("Hyderabad");
        user.setMobileNo(8099249209L);
        user.setAge(27);
        user.setUserType("Admin");

        User updateUser=userService.updateUser(user);
        assertThat(updateUser.getUserName()).isEqualTo("Lavanya Moyya");
        assertThat(updateUser.getEmail()).isEqualTo("moyya.lavanya@hcl.com");
        assertThat(updateUser.getAddress()).isEqualTo("Hyderabad");
        assertThat(updateUser.getMobileNo()).isEqualTo(8099249209L);
        assertThat(updateUser.getAge()).isEqualTo(27);
        assertThat(updateUser.getUserType()).isEqualTo("Admin");
    }
    @DisplayName("Junit Test for Deleting an User")
    @Test
    public void  givenUserObject_whenDeleteById_thenReturnNothing(){
        BDDMockito.willDoNothing().given(userRepository).deleteById(user.getUserid());
        userService.deleteUser(user.getUserid());
        verify(userRepository,times(1)).deleteById(user.getUserid());
    }

}
