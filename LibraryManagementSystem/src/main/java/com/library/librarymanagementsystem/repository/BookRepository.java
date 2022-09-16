package com.library.librarymanagementsystem.repository;

import com.library.librarymanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    @Query("SELECT b FROM Book b where b.bookName like %:bookName%")
    public List<Book>findByBookName(String bookName);
    @Query("SELECT DISTINCT b FROM Book b INNER JOIN FETCH b.authors a WHERE a.name LIKE %:name%")
    public List<Book>findByAuthorName(String name);
    @Query("SELECT DISTINCT b FROM Book b INNER JOIN FETCH b.authors a WHERE b.bookName like %:bookName% and a.name LIKE %:name%")
    public List<Book>findByBookNameAndAuthorName(String bookName,String name);
}
