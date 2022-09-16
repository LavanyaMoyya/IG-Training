package com.library.librarymanagementsystem.service;

import com.library.librarymanagementsystem.entity.BookIssue;

import java.util.List;
import java.util.Optional;

public interface BookIssueService {
    public BookIssue createBookIssue(long bookId, long userId, long libId, BookIssue bookIssue);
    public BookIssue saveBookIssue(BookIssue bookIssue);
    public List<BookIssue>getAllBookIssues();
    public Optional<BookIssue> getBookIssueById(long transactionId);
    public List<BookIssue>getAllBookIssuesByStatus(String status);
    public void deleteBookIssue(long transactionId);
    public BookIssue updateBookIssue(BookIssue bookIssue);




}
