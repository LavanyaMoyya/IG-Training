package com.library.librarymanagementsystem.service;

import com.library.librarymanagementsystem.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public Book saveBook(Long libId,Long autthorId,Book book);
    public Book saveBookInfo(Book book);
    public List<Book>getAllBooks();
    public Optional<Book>getBookByBookId(Long bookId);
    public List<Book>getBookByBookName(String bookName);
    public List<Book>getBookByAuthorName(String name);
    public List<Book> getBookByBookNameAndAuthorName(String bookName,String name);
    public Book updateBook(Book book);
    public void deleteBook(Long bookId);


}
