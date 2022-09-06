package com.junit.springbootjunit;

import com.junit.springbootjunit.entity.Product;
import com.junit.springbootjunit.repository.ProductRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SpringBootJunitApplicationTests {
@Autowired
    ProductRepository productRepository;
    @Test
    @Order(1)
   public void testCreate(){
        Product p=new Product();
        p.setId(1L);
        p.setName("Sony Head Phones");
        p.setDescription("Good");
        p.setPrice(200.00);
        productRepository.save(p);
        assertNotNull(productRepository.findById(1L).get());
    }
    @Test
    @Order(3)
   public void testReadAll(){
        List<Product> list=productRepository.findAll();
        assertThat(list.size()).isGreaterThan(0);
   }
   @Test
   @Order(2)
   public void testReadSingle(){
        Product product=productRepository.findById(1L).get();
        assertEquals(200.00,product.getPrice());
   }
   @Test
   @Order(4)
   public void testUpdate(){
        Product p=productRepository.findById(1L).get();
        p.setPrice(100.00);
        productRepository.save(p);
        assertNotEquals(200.00,productRepository.findById(1L).get().getPrice());
   }
   @Test
   @Order(5)
    public void testDelete(){
        productRepository.deleteById(1L);
        assertThat(productRepository.existsById(1L)).isFalse();
   }
}
