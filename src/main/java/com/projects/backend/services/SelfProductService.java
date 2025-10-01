package com.projects.backend.services;

import com.projects.backend.exceptions.ProductNotFoundException;
import com.projects.backend.models.Product;
import com.projects.backend.repos.ProductRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
@Primary
public class SelfProductService implements ProductService{
    ProductRepo productRepo;

    public SelfProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product replaceProduct(long id, Product product) {
        return null;
    }
}
