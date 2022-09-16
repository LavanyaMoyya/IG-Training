package com.library.librarymanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class BookIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionId;

    @ManyToOne
    @JoinColumn(name="book_id" ,referencedColumnName = "book_id")
    private Book bookId;

    @ManyToOne
    @JoinColumn(name="issue_to",referencedColumnName = "userid")
    private User issueTo;

    @ManyToOne
    @JoinColumn(name="issued_by",referencedColumnName = "userid")
    private User issuedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date bookIssueDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date bookReturnDate;

    @ManyToOne
    @JoinColumn(name="created_by",referencedColumnName = "userId")
    private User createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @ManyToOne
    @JoinColumn(name="modified_by",referencedColumnName = "userId")
    private User modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    private String status;
    private String remarks;





}
