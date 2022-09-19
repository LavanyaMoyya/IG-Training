package com.library.librarymanagementsystem.service;

import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.repository.BookRepository;
import com.library.librarymanagementsystem.serviceImpl.BookServiceImpl;
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
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookServiceImpl bookService;

    private Book book;
    @BeforeEach
    public void setUpBook(){
        book= Book.builder().book_id(1L).bookName("Thinking in Java")
                .noOfCopies(100).pages(800).price(490.00).publisher("Oracle Press").status("Available").build();
    }
    @DisplayName("Junit Test for Save Book")
    @Test
    public void givenBookObject_whenSave_thenReturnBookObject(){
        BDDMockito.given(bookRepository.findById(book.getBook_id())).willReturn(Optional.empty());
        BDDMockito.given(bookRepository.save(book)).willReturn(book);
        Book savedBook=bookService.saveBookInfo(book);
        assertThat(savedBook).isNotNull();
    }
    @DisplayName("Junit Test for Save Book throws an exception")
    @Test
    public void givenBookObject_whenSave_thenThrowException(){
        BDDMockito.given(bookRepository.findById(book.getBook_id())).willReturn(Optional.of(book));
        assertThrows(ResourceNotFoundException.class,()->{
          bookService.saveBookInfo(book);
        });
        verify(bookRepository,never()).save(any(Book.class));
    }
    @DisplayName("Junit Test for get All Books")
    @Test
    public void givenBookObject_whenFindAll_thenReturnBookList(){
        BDDMockito.given(bookRepository.findAll()).willReturn(Collections.singletonList(book));
        List<Book>bookList=bookService.getAllBooks();
        assertThat(bookList).isNotNull();
        assertThat(bookList.size()).isGreaterThan(1);
    }
    @DisplayName("Junit Test for get Book by id")
    @Test
    public void givenBookObject_whenFindById_thenReturnBookObject(){
        BDDMockito.given(bookRepository.findById(book.getBook_id())).willReturn(Optional.of(book));
        Book savedBook=bookService.getBookByBookId(book.getBook_id()).get();
        assertThat(savedBook).isNotNull();
    }
    @DisplayName("Junit Test for Update Book")
    @Test
    public void givenBookObject_WhenUpdateBook_thenReturnBookObject(){
        BDDMockito.given(bookRepository.save(book)).willReturn(book);
        book.setBookName("Java Basics");
        book.setPages(900);
        book.setPrice(500.00);
        book.setNoOfCopies(50);
        book.setPublisher("Sri Publications");
        book.setStatus("Not Available");

        Book updateBook=bookService.updateBook(book);
        assertThat(updateBook.getBookName()).isEqualTo("Java Basics");
        assertThat(updateBook.getPages()).isEqualTo(900);
        assertThat(updateBook.getPrice()).isEqualTo(500.00);
        assertThat(updateBook.getNoOfCopies()).isEqualTo(50);
        assertThat(updateBook.getPublisher()).isEqualTo("Sri Publications")
;        assertThat(updateBook.getStatus()).isEqualTo("Not Available");
    }
    @DisplayName("Junit Test for Deleting a Book")
    @Test
    public void givenBookObject_whenDeleteById_thenReturnNothing(){
        BDDMockito.willDoNothing().given(bookRepository).deleteById(book.getBook_id());
        bookService.deleteBook(book.getBook_id());
        verify(bookRepository,times(1)).deleteById(book.getBook_id());



    }



}
