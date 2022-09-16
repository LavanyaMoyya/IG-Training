package com.library.librarymanagementsystem.repository;

import com.library.librarymanagementsystem.entity.BookIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookIssueRepository extends JpaRepository<BookIssue,Long> {
    @Query("select bi from BookIssue bi where bi.status=:s")
    public List<BookIssue> getBookIssueByStatus(@Param("s") String status);
}
