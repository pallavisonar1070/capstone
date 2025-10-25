package com.projects.backend.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.projects.backend.models.Product;
import com.projects.backend.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProductController.class)
public class ProductMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean(name = "SelfProductService")
    private ProductService productService;

    @Autowired
    private ProductController productController;

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        objectMapper = new ObjectMapper();
    }

    @Test
    public void getProductById_ValidId_ReturnsProduct() throws Exception {
        // Arrange
        Long productId = 1L;
        Product product = new Product();
        product.setId(productId);
        product.setTitle("Test Product");
        product.setPrice(100.0);
        when(productService.getProductById(productId)).thenReturn(product);

        // Act & Assert
        mockMvc.perform(get("/products/{id}", productId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(productId))
                .andExpect(jsonPath("$.title").value("Test Product"))
                .andExpect(jsonPath("$.price").value(100.0));

        verify(productService, times(1)).getProductById(productId);
    }
}