package com.lavanya.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.librarymanagementsystem.controller.UserController;
import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = UserController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService userService;

    @Autowired
    private ObjectMapper objectMapper;
    private User user;

    @BeforeEach
    public void setUpUser(){
        user=User.builder().userName("Lavanya").age(28).email("lavanyamoyya3@gmail.com")
                .gender("Female").mobileNo(8096343303L).address("Vijayawada").userType("Student").status("Active").build();

    }
    @DisplayName("Junit Test for Creating rest api")
    @Test
    public void givenUserObject_whenCreateUser_thenReturnSaveUser() throws JsonProcessingException,Exception {
        BDDMockito.given(userService.createUser(any(User.class))).willAnswer(invocation -> invocation.getArgument(0));
        ResultActions response=mockMvc.perform(
                post("/users").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(user)));
        response.andDo(print()).andExpect(status().isCreated())
                .andExpect(jsonPath("$.userName", is(user.getUserName())))
                .andExpect(jsonPath("$.age", is(user.getAge())))
                .andExpect(jsonPath("$.gender", is(user.getGender())))
                .andExpect(jsonPath("$.email", is(user.getEmail())))
                .andExpect(jsonPath("$.mobileNo", is(user.getMobileNo())))
                .andExpect(jsonPath("$.address", is(user.getAddress())))
                .andExpect(jsonPath("$.userType", is(user.getUserType())))
                .andExpect(jsonPath("$.status", is(user.getStatus())));

    }
    @DisplayName("Junit Test for get All Users api")
    @Test
    public void givenUserObjectList_whenGetAllUser_thenReturnUserList() throws Exception {
        List<User> userList = new ArrayList<>();
        userList.add(User.builder().userName("Srikanth").age(31).email("g.srikanth@gmail.com").gender("Male")
                .mobileNo(9999999999L).address("Bangalore").userType("Student").status("Active").build());
        userList.add(User.builder().userName("Bhuvi Chaitra").age(25).email("bhuvi@gmail.com").gender("Female")
                .mobileNo(8888888888L).address("Pune").userType("Student").status("Active").build());
        BDDMockito.given(userService.getAllUsers()).willReturn(userList);
        ResultActions response = mockMvc.perform(get("/users"));
        response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.size()", is(userList.size())));
    }
    @DisplayName("Junit Test for get User by Id api")
    @Test
    public void givenUserObject_whenGetById_thenReturnUserObject() throws Exception {
        BDDMockito.given(userService.getUserById(user.getUserid())).willReturn(Optional.of(user));
        ResultActions response = mockMvc.perform(get("/users/{userId}", user.getUserid()));
        response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.userName", is(user.getUserName())))
                .andExpect(jsonPath("$.age", is(user.getAge())))
                .andExpect(jsonPath("$.gender", is(user.getGender())))
                .andExpect(jsonPath("$.email", is(user.getEmail())))
                .andExpect(jsonPath("$.mobileNo", is(user.getMobileNo())))
                .andExpect(jsonPath("$.address", is(user.getAddress())))
                .andExpect(jsonPath("$.userType", is(user.getUserType())))
                .andExpect(jsonPath("$.status", is(user.getStatus())));
    }
    @DisplayName("Junit Test for update User api")
    @Test
    public void givenUserObject_whenUpdateUser_thenReturnUserObject() throws JsonProcessingException, Exception {
        long usrId = 1L;
        User updateUser = User.builder().userName("Lavanya Moyya").age(27).email("moyya.lavanya@hcl.com")
                .mobileNo(8099249209L).address("Hyderabad").userType("Admin").build();
        BDDMockito.given(userService.getUserById(usrId)).willReturn(Optional.of(user));
        BDDMockito.given(userService.updateUser(any(User.class))).willAnswer(invocation -> invocation.getArgument(0));
        ResultActions response = mockMvc.perform(put("/users/{userId}", usrId).contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updateUser)));
        response.andExpect(status().isOk()).andDo(print());
    }
    @DisplayName("Junit Test for delete User api")
    @Test
    public void givenUserObject_whenDeleteById_thenReturnNothing() throws Exception {
        long userId = 3L;
        BDDMockito.willDoNothing().given(userService).deleteUser(userId);
        ResultActions response = mockMvc.perform(delete("/users/{userId}", userId));
        response.andExpect(status().isOk()).andDo(print());
    }


}
