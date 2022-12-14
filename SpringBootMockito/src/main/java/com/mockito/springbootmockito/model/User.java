package com.mockito.springbootmockito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private int id;
    private String name;
    private int age;
    private String address;

}
