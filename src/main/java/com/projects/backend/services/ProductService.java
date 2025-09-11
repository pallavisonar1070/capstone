package com.projects.backend.services;

import com.projects.backend.models.Product;
import org.springframework.stereotype.Service;

import javax.management.InstanceNotFoundException;
import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws InstanceNotFoundException;
    List<Product> getAllProducts();

    Product replaceProduct(long id, Product product);
}
