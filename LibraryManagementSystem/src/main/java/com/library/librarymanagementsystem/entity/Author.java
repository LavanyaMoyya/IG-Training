package com.library.librarymanagementsystem.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name="authors")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long author_id;
    private String name;
    private String description;


}
