package com.projects.backend.services;

import com.projects.backend.models.Product;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(Long id) {
        System.out.println("Product service");
        return null;
    }
}
