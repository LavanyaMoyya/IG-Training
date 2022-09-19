package com.library.librarymanagementsystem.repository;

import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.repository.BookRepository;
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
public class BookRepositoryTest {

    private BookRepository bookRepository;

    public BookRepositoryTest(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private Book book;

    @BeforeEach
    public void setUpBook(){
        book=Book.builder().book_id(1L).bookName("Thinking in Java")
                .noOfCopies(100).pages(800).price(490.00).publisher("Oracle Press").status("Available").build();
    }
    @DisplayName("Junit Test for save Book")
    @Test
    public void givenBookObject_whenSave_thenReturnBookObject(){
        Book savedBook=bookRepository.save(book);
        assertThat(savedBook).isNotNull();
        assertThat(savedBook.getBook_id()).isGreaterThan(0);
    }
    @DisplayName("JUnit Test for get All Books")
    @Test
    public void givenBookList_whenFindAll_thenReturnBookList(){
        bookRepository.save(book);
        List<Book>bookList=bookRepository.findAll();
        assertThat(bookList).isNotNull();
        assertThat(bookList.size()).isGreaterThan(6);
    }
    @DisplayName("Junit Test for get Book by id")
    @Test
    public void givenBookObject_whenFindById_thenReturnBookObject(){
        bookRepository.save(book);
        Book book1=bookRepository.findById(book.getBook_id()).get();
        assertThat(book1).isNotNull();
    }
    @DisplayName("Junit Test for update Book")
    @Test
    public void givenBookObject_whenUpdate_thenReturnBookObject(){
        bookRepository.save(book);
        Book savedBook=bookRepository.findById(book.getBook_id()).get();
        savedBook.setBookName("Java Basics");
        savedBook.setPages(900);
        savedBook.setPrice(500.00);
        savedBook.setNoOfCopies(50);
        savedBook.setPublisher("Sri Publications");
        savedBook.setStatus("Not Available");

        Book updateBook=bookRepository.save(savedBook);
        assertThat(updateBook.getBookName()).isEqualTo("Java Basics");
        assertThat(updateBook.getPages()).isEqualTo(900);
        assertThat(updateBook.getPrice()).isEqualTo(500.00);
        assertThat(updateBook.getNoOfCopies()).isEqualTo(50);
        assertThat(updateBook.getPublisher()).isEqualTo("Sri Publications");
        assertThat(updateBook.getStatus()).isEqualTo("Not Available");
    }
    @DisplayName("Junit Test for Deleting the book")
    @Test
    public void givenBookObject_whenDelete_thenReturnNothing(){
        bookRepository.save(book);
        bookRepository.deleteById(book.getBook_id());
        Optional<Book>bookDetails=bookRepository.findById(book.getBook_id());
        assertThat(bookDetails).isEmpty();
    }

}
