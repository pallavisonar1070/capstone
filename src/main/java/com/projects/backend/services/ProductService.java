package com.projects.backend.services;

import com.projects.backend.models.Product;
import org.springframework.stereotype.Service;

public interface ProductService {
    Product getProductById(Long id);
}
