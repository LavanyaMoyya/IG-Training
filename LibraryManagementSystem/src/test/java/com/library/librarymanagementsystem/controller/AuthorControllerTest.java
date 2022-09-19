package com.library.librarymanagementsystem.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.service.AuthorService;
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

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = AuthorController.class)
public class AuthorControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private AuthorService authorService;
    @Autowired
    private ObjectMapper objectMapper;
    private Author author;

    @BeforeEach
    public void setUpBook() {
        author=Author.builder().author_id(1L).name("Bruce Eckel").description("He is a programmer").build();

    }

    @DisplayName("Junit test for save author rest api")
    @Test
    public void givenAuthorObject_whenSave_thenReturnAuthorObject() throws JsonProcessingException,Exception{

        BDDMockito.given(authorService.createAuthor(any(Author.class))).willAnswer(invocation -> invocation.getArgument(0));
        ResultActions response = mockMvc.perform(
                post("/authors").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(author)));
        response.andExpect(status().isCreated()).andDo(print());
    }

    @DisplayName("Junit test for get all authors rest api")
    @Test
    public void givenAuthorList_whenFindAll_thenReturnAuthorList() throws Exception {
        List<Author> authorList = new ArrayList<>();
        authorList.add(Author.builder().name("Herbert Schildt").description("He wrote a book named Java: A Beginner’s Guide").build());
        authorList.add(Author.builder().name("Joshua Bloch").description("He wrote a book named Effective Java ").build());

        BDDMockito.given(authorService.getAllAuthors()).willReturn(authorList);
        ResultActions response = mockMvc.perform(get("/authors"));
        response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.size()", is(authorList.size())));
    }

    @DisplayName("Junit test for get Author by id rest api")
    @Test
    public void givenAuthorObject_whenGetAuthorById_thenReturnAuthorObject() throws Exception {
        BDDMockito.given(authorService.getAuthorById(author.getAuthor_id())).willReturn(Optional.of(author));
        ResultActions response = mockMvc.perform(get("/author/{authorId}", author.getAuthor_id()));
        response.andExpect(status().isOk()).andDo(print());
    }

    @DisplayName("Junit test for delete author rest api")
    @Test
    public void givenAuthorObject_whenDeleteById_thenReturnNothing() throws Exception {
        long authorId = 2L;
        BDDMockito.willDoNothing().given(authorService).deleteAuthor(authorId);
        ResultActions response = mockMvc.perform(delete("/authors/{authorId}", authorId));
        response.andExpect(status().isOk()).andDo(print());
    }

    @DisplayName("Junit test for update author rest api")
    @Test
    public void givenAuthorObject_whenUpdateAuthorById_thenReturnAuthor() throws Exception {
        long authorId = 1L;
        Author savedAuthor = Author.builder().name("Bruce Eckel").description("He is a programmer").build();
        Author authorUpdate = Author.builder().name("Bruce").build();

        BDDMockito.given(authorService.getAuthorById(author.getAuthor_id())).willReturn(Optional.of(savedAuthor));
        BDDMockito.given(authorService.updateAuthor(any(Author.class))).willAnswer(invocation-> invocation.getArgument(0));

        ResultActions response = mockMvc.perform(put("/authors/{authorId}", authorId).contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(authorUpdate)));
        response.andDo(print());
    }
}
