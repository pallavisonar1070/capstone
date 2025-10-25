package com.projects.backend.controllers;

import com.projects.backend.exceptions.ProductNotFoundException;
import com.projects.backend.models.Product;
import com.projects.backend.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
    @Autowired
    ProductController productController;
    @MockBean
    ProductService productService;

    @Test
    void getProductById() {
        long productId = 1L;
        Product product = new Product();
        product.setId(productId);
        product.setTitle("Test Product");
        when(productService.getProductById(productId)).thenReturn(product);
        Product p = productController.getProductById(productId).getBody();
        Assertions.assertEquals("Test Product", p.getTitle());
    }
    @Test
    void WhenGetProductByIdCalledThrowException() {
        long productId = 2L;
        Product product = new Product();
        product.setId(productId);
        product.setTitle("Test Product");
        when(productService.getProductById(productId)).thenThrow(ProductNotFoundException.class);
        Assertions.assertThrows(ProductNotFoundException.class, ()-> productController.getProductById(productId).getBody());
//        Product p = productController.getProductById(productId).getBody();
//        Assertions.assertEquals("Test Product", p.getTitle());

    }
}