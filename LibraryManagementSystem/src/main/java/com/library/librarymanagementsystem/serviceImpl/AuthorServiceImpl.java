package com.library.librarymanagementsystem.serviceImpl;

import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.repository.AuthorRepository;
import com.library.librarymanagementsystem.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author createAuthor(Author author) {
        Optional<Author> saveAuthor = authorRepository.findById((author.getAuthor_id()));
        if (saveAuthor.isPresent()) {
            throw new ResourceNotFoundException("User already exist with given id :" + author.getAuthor_id());
        }
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> getAuthorById(Long authorId) {
        return authorRepository.findById(authorId);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(long authorId) {
        authorRepository.deleteById(authorId);
    }


}

