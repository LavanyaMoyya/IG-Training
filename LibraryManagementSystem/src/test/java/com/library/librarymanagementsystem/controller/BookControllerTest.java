package com.library.librarymanagementsystem.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.librarymanagementsystem.controller.BookController;
import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.service.BookService;
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

@WebMvcTest(value = BookController.class)
public class BookControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private BookService bookService;
    @Autowired
    private ObjectMapper objectMapper;
    private Book book;

    @BeforeEach
    public void setUpBook() {
        book=Book.builder().book_id(1L).bookName("Thinking in Java")
                .noOfCopies(100).pages(800).price(490.00).publisher("Oracle Press").status("Available").build();
    }

    @DisplayName("Junit test for save book rest api")
    @Test
    public void givenBookObject_whenSave_thenReturnBookObject() throws JsonProcessingException,Exception{

        BDDMockito.given(bookService.saveBookInfo(any(Book.class))).willAnswer(invocation -> invocation.getArgument(0));
        ResultActions response = mockMvc.perform(
                post("/books").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(book)));
        response.andExpect(status().isCreated()).andDo(print());
    }

    @DisplayName("Junit test for get all books rest api")
    @Test
    public void givenBookList_whenFindAll_thenReturnBookList() throws Exception {
        List<Book> bookList = new ArrayList<>();
        bookList.add(Book.builder().bookName("AWS").noOfCopies(500).pages(1200).price(950.00).publisher("Addison Wesley")
                .status("Available").build());
        bookList.add(Book.builder().bookName("DevOops").noOfCopies(100).pages(800).price(650.00).publisher("Sri Publications")
                .status("Available").build());
        BDDMockito.given(bookService.getAllBooks()).willReturn(bookList);
        ResultActions response = mockMvc.perform(get("/books"));
        response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.size()", is(bookList.size())));
    }

    @DisplayName("Junit test for get book by id rest api")
    @Test
    public void givenBookObject_whenGetBookById_thenReturnBookObject() throws Exception {
        BDDMockito.given(bookService.getBookByBookId(book.getBook_id())).willReturn(Optional.of(book));
        ResultActions response = mockMvc.perform(get("/books/{bookId}", book.getBook_id()));
        response.andExpect(status().isOk()).andDo(print());
    }

    @DisplayName("Junit test for delete book rest api")
    @Test
    public void givenBookObject_whenDeleteById_thenReturnNothing() throws Exception {
        long bookId = 2L;
        BDDMockito.willDoNothing().given(bookService).deleteBook(bookId);
        ResultActions response = mockMvc.perform(delete("/books/{bookId}", bookId));
        response.andExpect(status().isOk()).andDo(print());
    }

    @DisplayName("Junit test for update book rest api")
    @Test
    public void givenBookObject_whenUpdateBookById_thenReturnBook() throws Exception {
        long bookId = 4L;
        Book savedBook = Book.builder().bookName("DevOops").noOfCopies(100).pages(800).price(650.00)
                .status("Available").build();
        Book bookUpdate = Book.builder().status("Available").build();

        BDDMockito.given(bookService.getBookByBookId(book.getBook_id())).willReturn(Optional.of(savedBook));
        BDDMockito.given(bookService.updateBook(any(Book.class))).willAnswer(invocation-> invocation.getArgument(0));

        ResultActions response = mockMvc.perform(put("/books/{bookId}", bookId).contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(bookUpdate)));
        response.andDo(print());
    }

}
