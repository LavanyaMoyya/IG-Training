package com.lavanya.service;

import com.library.librarymanagementsystem.entity.BookIssue;
import com.library.librarymanagementsystem.repository.BookIssueRepository;
import com.library.librarymanagementsystem.serviceImpl.BookIssueServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
public class BookIssueServiceTest {

    @Mock
    private BookIssueRepository bookIssueRepository;

    @InjectMocks
    private BookIssueServiceImpl bookIssueService;

    private BookIssue bookIssue;

    @BeforeEach
    public void setupBookIssue() {
        bookIssue = BookIssue.builder().bookIssueDate(new Date()).status("Approved").remarks("Book Issued").build();
    }

    @DisplayName("Junit test for save book issue")
    @Test
    public void givenBookIssueObject_whenCreateBookIssue_thenReturnBookIssue() {
        BDDMockito.given(bookIssueRepository.findById(bookIssue.getTransactionId())).willReturn(Optional.empty());
        BDDMockito.given(bookIssueRepository.save(bookIssue)).willReturn(bookIssue);
        BookIssue savedBookIssue = bookIssueService.saveBookIssue(bookIssue);
        assertThat(savedBookIssue).isNotNull();
    }

    @DisplayName("Junit test for find all book issue")
    @Test
    public void givenBookIssue_whenFindAllBookIssue_thenReturnBookIssue() {
        BookIssue  bookIssue = BookIssue.builder().bookIssueDate(new Date()).status("Approved").remarks("Book Issued").build();
        BDDMockito.given(bookIssueRepository.findAll()).willReturn(Collections.singletonList(bookIssue));
        List<BookIssue> bookIssueList = bookIssueService.getAllBookIssues();
        assertThat(bookIssueList).isNotNull();
        assertThat(bookIssueList.size()).isEqualTo(1);
    }

    @DisplayName("Junit test for get book issue by transaction id")
    @Test
    public void givenBookIssue_whenFindById_thenReturnBookIssue() {
        BDDMockito.given(bookIssueRepository.findById(bookIssue.getTransactionId())).willReturn(Optional.of(bookIssue));
        BookIssue savedBookIssue = bookIssueService.getBookIssueById(bookIssue.getTransactionId()).get();
        assertThat(savedBookIssue).isNotNull();
    }

    @DisplayName("Junit test for delete book issue")
    @Test
    public void givenBookIssue_whenDeleteById_thenReturnBookIssue() {
        long transactionId = 1L;
        BDDMockito.willDoNothing().given(bookIssueRepository).deleteById(transactionId);
        bookIssueService.deleteBookIssue(transactionId);
        verify(bookIssueRepository, times(1)).deleteById(transactionId);
    }
}