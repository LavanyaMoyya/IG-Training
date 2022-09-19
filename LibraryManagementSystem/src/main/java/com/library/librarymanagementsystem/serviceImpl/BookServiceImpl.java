package com.library.librarymanagementsystem.serviceImpl;

import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.repository.AuthorRepository;
import com.library.librarymanagementsystem.repository.BookRepository;
import com.library.librarymanagementsystem.repository.UserRepository;
import com.library.librarymanagementsystem.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;
    private UserRepository userRepository;
    private AuthorRepository authorRepository;


    public BookServiceImpl(BookRepository bookRepository, UserRepository userRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Book saveBook(Long libId,Long authorId, Book book) {
        User user=userRepository.findById(libId).get();
        Author author=authorRepository.findById(authorId).get();
        book.setCreatedBy(user);
        book.setAuthor(author);
        return bookRepository.save(book);

    }

    @Override
    public Book saveBookInfo(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookByBookId(Long bookId) {
        return bookRepository.findById(bookId);
    }

    @Override
    public List<Book> getBookByBookName(String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    @Override
    public List<Book> getBookByAuthorName(String name) {
        return bookRepository.findByAuthorName(name);
    }

    @Override
    public List<Book> getBookByBookNameAndAuthorName(String bookName, String name) {
        return bookRepository.findByBookNameAndAuthorName(bookName,name);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }


}
