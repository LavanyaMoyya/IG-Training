package com.lavanya.service;

import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.entity.User;
import com.library.librarymanagementsystem.exception.ResourceNotFoundException;
import com.library.librarymanagementsystem.repository.AuthorRepository;
import com.library.librarymanagementsystem.serviceImpl.AuthorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {
    @Mock
    private AuthorRepository authorRepository;
    @InjectMocks
    private AuthorServiceImpl authorService;
    private Author author;

    @BeforeEach
    public void setUpAuthor(){
        author=Author.builder().author_id(1L).name("Bruce Eckel").description("He is a programmer").build();
    }
    @DisplayName("Junit Test for Save Author")
    @Test
    public void givenAuthorObject_whenSave_thenReturnAuthorObject(){
        BDDMockito.given(authorRepository.save(author)).willReturn(author);
        Author savedAuthor=authorService.createAuthor(author);
        assertThat(savedAuthor).isNotNull();
    }
    @DisplayName("Junit Test for Save Author throw an exception")
    @Test
    public void  givenAuthorObject_whenSave_thenThrowException(){
        BDDMockito.given(authorRepository.findById(author.getAuthor_id())).willReturn(Optional.of(author));
        assertThrows(ResourceNotFoundException.class,()->{
            authorService.createAuthor(author);
        });
        verify(authorRepository,never()).save(any(Author.class));
    }
    @DisplayName("Junit Test for get All Authors")
    @Test
    public void givenAuthorObject_whenGetAllAuthors_thenReturnAuthorList(){
        BDDMockito.given(authorRepository.findAll()).willReturn(Collections.singletonList(author));
        List<Author>authorList=authorService.getAllAuthors();
        assertThat(authorList).isNotNull();
        assertThat(authorList.size()).isGreaterThan(1);
    }
    @DisplayName("Junit Test for get Author by Id")
    @Test
    public void givenAuthorObject_whenFindById_thenReturnAuthorObject(){
        BDDMockito.given(authorRepository.findById(author.getAuthor_id())).willReturn(Optional.of(author));
        Author savedAuthor =authorService.getAuthorById(author.getAuthor_id()).get();
        assertThat(savedAuthor).isNotNull();
    }
    @DisplayName("Junit Test for Update Author")
    @Test
    public void givenAuthorObject_whenUpdateAuthor_thenReturnAuthorObject(){
        BDDMockito.given(authorRepository.save(author)).willReturn(author);
        author.setName("Bruce");
        author.setDescription("He is a Consultant");

        Author updateAuthor=authorService.updateAuthor(author);
        assertThat(updateAuthor.getName()).isEqualTo("Bruce");
        assertThat(updateAuthor.getDescription()).isEqualTo("He is a Consultant");
    }
    @DisplayName("Junit Test for Deleting an Author")
    @Test
    public void  givenAuthorObject_whenDeleteById_thenReturnNothing(){
        BDDMockito.willDoNothing().given(authorRepository).deleteById(author.getAuthor_id());
        authorService.deleteAuthor(author.getAuthor_id());
        verify(authorRepository,times(1)).deleteById(author.getAuthor_id());
    }
}
