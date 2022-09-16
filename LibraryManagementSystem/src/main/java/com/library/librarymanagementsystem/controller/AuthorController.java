package com.library.librarymanagementsystem.controller;

import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.service.AuthorService;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        super();
        this.authorService = authorService;
    }
    @PostMapping("/authors")
    @ResponseStatus(HttpStatus.CREATED)
    public Author saveAuthor(@RequestBody Author author){
       return authorService.createAuthor(author);

    }
    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();

    }
    @GetMapping("/authors/{authorId}")
    public Optional<Author>getAuthorById(@PathVariable("authorId") Long authorId){
        Optional<Author>author=authorService.getAuthorById(authorId);
        if(author.isPresent()){
            return author;
        }else{
            throw new ResourceNotFoundException("Author Not found with given Id:"+authorId);
        }
    }
    @PutMapping("/authors/{authorId}")
    public ResponseEntity<Author>updateAuthor(@PathVariable long authorId,@RequestBody Author author){
        return authorService.getAuthorById(authorId).map(a->{
            a.setName(author.getName());
            a.setDescription((author.getDescription()));
            Author authorUpdate=authorService.updateAuthor(a);
            return new ResponseEntity<>(authorUpdate,HttpStatus.OK);
        }).orElseGet(()->ResponseEntity.notFound().build());
    }
    @DeleteMapping("/authors/{authorId}")
    public void deleteAuthor(@PathVariable long authorId){

        var author=authorService.getAuthorById(authorId)
                .orElseThrow(()-> new ResourceNotFoundException(("Author not found with given id:"+authorId)));
        authorService.deleteAuthor(authorId);
    }

}
