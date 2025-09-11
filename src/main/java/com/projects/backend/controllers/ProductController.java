package com.projects.backend.controllers;

import com.projects.backend.models.Product;
import com.projects.backend.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){

        return productService.getProductById(id);
    }

    @GetMapping()
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @PutMapping("{id}")
    public Product replaceProduct(@PathVariable("id") long id, @RequestBody Product product){
        return productService.replaceProduct(id, product);
    }
}
