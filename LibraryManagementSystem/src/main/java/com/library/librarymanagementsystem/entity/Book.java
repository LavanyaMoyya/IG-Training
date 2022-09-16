package com.library.librarymanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long book_id;
    private String bookName;
    private int pages;
    private double price;
    private int noOfCopies;
    private String publisher;
    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "userid")
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "modified_by", referencedColumnName = "userid")
    private User modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    private String status;
    @OneToOne(mappedBy = "book")
    private Author author;

}
