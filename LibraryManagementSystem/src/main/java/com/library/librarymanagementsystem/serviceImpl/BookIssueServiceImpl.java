package com.library.librarymanagementsystem.serviceImpl;

import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.entity.BookIssue;
import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.repository.BookIssueRepository;
import com.library.librarymanagementsystem.repository.BookRepository;
import com.library.librarymanagementsystem.repository.UserRepository;
import com.library.librarymanagementsystem.service.BookIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookIssueServiceImpl implements BookIssueService {
    @Autowired
    private BookIssueRepository bookIssueRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookIssue createBookIssue(long bookId, long userId, long libId, BookIssue bookIssue) {
        User user=userRepository.findById(userId).get();
        User librId=userRepository.findById(libId).get();
        Book book=bookRepository.findById(bookId).get();


        bookIssue.setBookId(book);
        bookIssue.setIssueTo(user);
        bookIssue.setCreatedBy(librId);
        bookIssue.setIssuedBy(librId);
        bookIssue.setModifiedBy(librId);
        return bookIssueRepository.save(bookIssue);
    }

    @Override
    public BookIssue saveBookIssue(BookIssue bookIssue) {
        return bookIssueRepository.save(bookIssue);
    }

    @Override
    public List<BookIssue> getAllBookIssues() {
        return bookIssueRepository.findAll();
    }

    @Override
    public Optional<BookIssue> getBookIssueById(long transactionId) {
        return bookIssueRepository.findById(transactionId);
    }

    @Override
    public List<BookIssue> getAllBookIssuesByStatus(String status) {
        return bookIssueRepository.getBookIssueByStatus(status);
    }

    @Override
    public void deleteBookIssue(long transactionId) {
        bookIssueRepository.deleteById(transactionId);
    }

    @Override
    public BookIssue updateBookIssue(BookIssue bookIssue) {

        return  bookIssueRepository.save(bookIssue);
    }
}
