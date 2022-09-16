package com.lavanya.repository;

import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.repository.AuthorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AuthorRepositoryTest {
    private AuthorRepository authorRepository;

    public AuthorRepositoryTest(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    private Author author;

    @BeforeEach
    public void setUpAuthor(){
        author=Author.builder().author_id(1L).name("Bruce Eckel").description("He is a programmer").build();
    }
    @DisplayName("Junit Test for save Author")
    @Test
    public void givenAuthorObject_whenSave_thenReturnAuthorObject(){
        Author savedAuthor=authorRepository.save(author);
        assertThat(savedAuthor).isNotNull();
    }

    @DisplayName("Junit Test for get All Authors")
    @Test
    public void givenAuthorList_whenFindAll_thenReturnAuthorList(){
        authorRepository.save(author);
        List<Author> authorList=authorRepository.findAll();
        assertThat(authorList).isNotNull();
        assertThat(authorList.size()).isGreaterThan(0);

    }
    @DisplayName("Junit Test for get Author By Id")
    @Test
    public void givenAuthorObject_whenFindById_thenReturnAuthorObject(){
        authorRepository.save(author);
        Author author1=authorRepository.findById(author.getAuthor_id()).get();
        assertThat(author1).isNotNull();
    }
    @DisplayName("Junit Test for Update Author")
    @Test
    public void givenAuthorObject_whenUpdate_thenReturnAuthorObject(){
        authorRepository.save(author);
        Author savedAuthor=authorRepository.findById(author.getAuthor_id()).get();
        savedAuthor.setName("Bruce");
        savedAuthor.setDescription("He is Consultant");

        Author updateAuthor=authorRepository.save(savedAuthor);
        assertThat(updateAuthor.getName()).isEqualTo("Bruce");
        assertThat(updateAuthor.getDescription()).isEqualTo("He is Consultant");
    }
    @DisplayName("Junit Test for Delete Author")
    @Test
    public void givenAuthorObject_whenDelete_thenReturnNothing(){
        authorRepository.save(author);
        authorRepository.deleteById(author.getAuthor_id());
        Optional<Author>authorDetails=authorRepository.findById(author.getAuthor_id());
        assertThat(authorDetails).isEmpty();

    }

}
