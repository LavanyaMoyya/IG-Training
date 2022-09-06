package com.junit.springbootjunit.repository;

import com.junit.springbootjunit.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
