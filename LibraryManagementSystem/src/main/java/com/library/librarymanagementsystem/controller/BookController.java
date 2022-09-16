package com.library.librarymanagementsystem.controller;

import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.service.BookService;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping("/books/{libId}")
    public Book saveBook(@PathVariable("libId") Long libId,@PathVariable("authorId") Long authorId, Book book){

        return bookService.saveBook(libId,authorId,book);
    }
    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book){
        return bookService.saveBookInfo(book);
    }
    @GetMapping("/books")
    public List<Book>getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{bookId}")
    public Optional<Book>getBookByBookId(@PathVariable Long bookId){
        Optional<Book>book=bookService.getBookByBookId(bookId);
        if(book.isPresent()){
            return book;
        }else{
            throw new ResourceNotFoundException("Book Not found with given Id:"+bookId);
        }

    }
    @GetMapping("/books/searchByBookName")
    public List<Book>getBookByBookName(@RequestParam String bookName){
        return bookService.getBookByBookName(bookName);
    }
    @GetMapping("/books/searchByAuthorName")
    public List<Book>getBookByAuthorName(@RequestParam String name){
        return bookService.getBookByAuthorName(name);
    }
    @GetMapping("/books/searchByBookAndAuthor")
    public List<Book>getBookByBookNameAndAuthorName(@RequestParam String bookName,@RequestParam String name){
        return bookService.getBookByBookNameAndAuthorName(bookName,name);
    }
    @PutMapping("/books/{bookId}")
    public ResponseEntity<Book>updateBook(@PathVariable long bookId,Book updateBook){
        return bookService.getBookByBookId(bookId).map(savedBook->{
            savedBook.setBookName(updateBook.getBookName());
            savedBook.setCreatedOn(updateBook.getCreatedOn());
            savedBook.setModifiedBy(updateBook.getModifiedBy());
            savedBook.setModifiedOn(updateBook.getModifiedOn());
            savedBook.setNoOfCopies(updateBook.getNoOfCopies());
            savedBook.setPrice(updateBook.getPrice());
            savedBook.setPages(updateBook.getPages());
            savedBook.setPublisher(updateBook.getPublisher());

            Book updatedBookInfo=bookService.saveBookInfo(updateBook);
            return new ResponseEntity<>(updatedBookInfo,HttpStatus.OK);
        }).orElseGet(()->ResponseEntity.notFound().build());

    }
    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable Long bookId){
        var book=bookService.getBookByBookId(bookId)
                .orElseThrow(()->new ResourceNotFoundException("Book not found with given id: "+bookId));
        bookService.deleteBook(bookId);
    }
}
