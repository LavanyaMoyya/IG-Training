package com.lavanya.repository;

import com.library.librarymanagementsystem.entity.BookIssue;
import com.library.librarymanagementsystem.repository.BookIssueRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookIssueRepositoryTest {
    private BookIssueRepository bookIssueRepository;

    public BookIssueRepositoryTest(BookIssueRepository bookIssueRepository) {
        this.bookIssueRepository = bookIssueRepository;
    }
    private BookIssue bookIssue;
    @BeforeEach
    public void setupBookIssue() {
        bookIssue = BookIssue.builder().bookIssueDate(new Date()).status("Approved").remarks("Book Issued").build();
    }

    @DisplayName("Junit test for issue book rest api")
    @Test
    public void givenBookIssue_whenSave_thenReturnBookIssue() {
        BookIssue savedBookIssue = bookIssueRepository.save(bookIssue);
        assertThat(savedBookIssue).isNotNull();
        assertThat(savedBookIssue.getTransactionId()).isGreaterThan(0);
    }

    @DisplayName("Junit test for get all book issued rest api")
    @Test
    public void givenBookIssueList_whenFindAll_thenReturnBookIssueList() {
        BookIssue bookIssue1 = BookIssue.builder().bookIssueDate(new Date()).status("Approved").remarks("Book Issued")
                .build();
        bookIssueRepository.save(bookIssue);
        bookIssueRepository.save(bookIssue1);
        List<BookIssue> bookIssueList = bookIssueRepository.findAll();
        assertThat(bookIssueList).isNotNull();
        assertThat(bookIssueList.size()).isEqualTo(5);
    }

    @DisplayName("Junit test for get book issue by transaction id")
    @Test
    public void givenBookIssue_whenFindById_thenReturnBookIssue() {
        bookIssueRepository.save(bookIssue);
        BookIssue savedBookIssue = bookIssueRepository.findById(bookIssue.getTransactionId()).get();
        assertThat(savedBookIssue).isNotNull();
    }

    @DisplayName("Junit test for delete book issue")
    @Test
    public void givenBookIssue_whenDeleteById_thenReturnBookIssue() {
        bookIssueRepository.save(bookIssue);
        bookIssueRepository.deleteById(bookIssue.getTransactionId());
        Optional<BookIssue> savedBookIssue = bookIssueRepository.findById(bookIssue.getTransactionId());
        assertThat(savedBookIssue).isEmpty();
    }
}
