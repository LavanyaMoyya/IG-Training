package com.library.librarymanagementsystem.service;

import com.library.librarymanagementsystem.entity.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    public Author createAuthor(Author author);
    public List<Author> getAllAuthors();
    public Optional<Author> getAuthorById(Long authorId);
    public Author updateAuthor(Author author);
    public void deleteAuthor(long authorId);
}
