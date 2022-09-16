package com.lavanya.repository;

import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    private UserRepository userRepository;

    public UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private User user;

    @BeforeEach
    public void setUpUser(){
        user=User.builder().userName("Lavanya").age(28).email("lavanyamoyya3@gmail.com")
                .gender("Female").mobileNo(8096343303L).address("Vijayawada").userType("Student").build();

    }
    @DisplayName("Junit Test for Save User")
    @Test
    public void givenUserObject_whenSave_thenReturnUser(){
        User savedUser=userRepository.save(user);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getUserid()).isGreaterThan(0);
    }
    @DisplayName("Junit Test for get all Users")
    @Test
    public void givenUserListObject_whenFindAll_thenReturnUserList(){
        userRepository.save(user);
        List<User>userList=userRepository.findAll();
        assertThat(userList).isNotNull();
        assertThat(userList.size()).isGreaterThan(6);

    }
    @DisplayName("Junit Test for get User By Id")
    @Test
    public void givenUserObject_whenFindById_thenReturnUser(){
        userRepository.save(user);
        User savedUser=userRepository.findById(user.getUserid()).get();
        assertThat(savedUser).isNotNull();
    }
    @DisplayName("Junit Test for Update user")
    @Test
    public void givenUserObject_whenUpdate_thenReturnUser(){
        userRepository.save(user);
        User savedUser=userRepository.findById(user.getUserid()).get();
        savedUser.setUserName("Lavanya Moyya");
        savedUser.setEmail("moyya.lavanya@hcl.com");
        savedUser.setAddress("Hyderabad");
        savedUser.setMobileNo(8099249209L);
        savedUser.setAge(27);
        savedUser.setUserType("Admin");

        User updateUser=userRepository.save(savedUser);
        assertThat(updateUser.getUserName()).isEqualTo("Lavanya Moyya");
        assertThat(updateUser.getEmail()).isEqualTo("moyya.lavanya@hcl.com");
        assertThat(updateUser.getAddress()).isEqualTo("Hyderabad");
        assertThat(updateUser.getMobileNo()).isEqualTo(8099249209L);
        assertThat(updateUser.getAge()).isEqualTo(27);
        assertThat(updateUser.getStatus()).isEqualTo("Admin");

    }
    @DisplayName("Junit Test for Delete User")
    @Test
    public void givenUserObject_whenDelete_thenReturnNothing(){
        userRepository.save(user);
        userRepository.deleteById(user.getUserid());
        Optional<User> userDetails=userRepository.findById(user.getUserid());
        assertThat(userDetails).isEmpty();

    }
}
