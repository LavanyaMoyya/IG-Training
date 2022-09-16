package com.library.librarymanagementsystem.controller;

import com.library.librarymanagementsystem.entity.BookIssue;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.service.BookIssueService;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookIssueController {
    private BookIssueService bookIssueService;

    public BookIssueController(BookIssueService bookIssueService) {
        this.bookIssueService = bookIssueService;
    }
    @PostMapping("/bookissue/{bookId}/{userId}/{libId}")
    public BookIssue createBookIssue(@PathVariable("bookId") Long bookId, @PathVariable("userId") Long userId,
                                     @PathVariable("libId") Long libId, @RequestBody BookIssue bookIssue){
        return bookIssueService.createBookIssue(bookId,userId,libId,bookIssue);
    }
    @GetMapping("/bookissuelist")
    public List<BookIssue>getAllBookIssues(){
        return bookIssueService.getAllBookIssues();
    }
    @PostMapping("/bookissue")
    @ResponseStatus(HttpStatus.CREATED)
    public BookIssue saveBookIssue(@RequestBody BookIssue bookIssue){
        return bookIssueService.saveBookIssue(bookIssue);
    }
    @GetMapping("/bookissue/{transactionId}")
    public Optional<BookIssue>getBookIssueById(@PathVariable long transactionId){
        Optional<BookIssue>bookIssue=bookIssueService.getBookIssueById(transactionId);
        if(bookIssue.isPresent()){
            return bookIssue;
        }else{
            throw new ResourceNotFoundException("BookIssue not found with given Id: "+transactionId);
        }
    }
    @GetMapping("/bookissue/query")
    public List<BookIssue>getAllBookIssuesByStatus(@RequestParam String status){
        return bookIssueService.getAllBookIssuesByStatus(status);
    }
    @DeleteMapping("/bookissue/transactionId")
    public void deleteBookIssue(@PathVariable long transactionId){
        var bookIssue=bookIssueService.getBookIssueById(transactionId)
                .orElseThrow(()->new ResourceNotFoundException("Book issue not found with given Id:"+transactionId));
        bookIssueService.deleteBookIssue(transactionId);
    }
    @PutMapping("/bookissue/{transactionId")
    public ResponseEntity<BookIssue> updateBookIssue(@PathVariable long transactionId, @RequestBody BookIssue bookIssue){
        return bookIssueService.getBookIssueById(transactionId).map(book->{
            book.setRemarks(bookIssue.getRemarks());
            book.setStatus(bookIssue.getStatus());
            BookIssue updateBookIssue=bookIssueService.updateBookIssue(book);
            return new ResponseEntity<>(updateBookIssue,HttpStatus.OK);
        }).orElseGet(()->ResponseEntity.notFound().build());

    }

}
