package com.library.librarymanagementsystem.entity;

import lombok.*;

import javax.persistence.*;

@Table
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userid;
    private String userName;
    private int age;
    private String gender;
    private String email;
    private long mobileNo;
    private String address;
    private String userType;
    private String status;
}
