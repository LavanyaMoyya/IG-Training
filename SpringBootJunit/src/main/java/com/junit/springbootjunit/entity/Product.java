package com.junit.springbootjunit.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Setter
@Getter
public class Product {
    @Id
    private Long id;
    private String name;
    private Double price;
    private String description;
}
