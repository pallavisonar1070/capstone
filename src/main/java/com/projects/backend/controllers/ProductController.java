package com.projects.backend.controllers;

import com.projects.backend.models.Product;
import com.projects.backend.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws InstanceNotFoundException {
        Product product = null;
        product = productService.getProductById(id);

        ResponseEntity<Product> productResponseEntity;
//        if(product == null){
//            productResponseEntity = new ResponseEntity<>("Product not found for ID" +id, HttpStatus.NOT_FOUND);
//            return productResponseEntity;
//        }
        productResponseEntity = new ResponseEntity<>(product, HttpStatus.OK);
        return productResponseEntity;
    }

    @GetMapping()
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @PutMapping("{id}")
    public Product replaceProduct(@PathVariable("id") long id, @RequestBody Product product){
        return productService.replaceProduct(id, product);
    }

    @ExceptionHandler(InstanceNotFoundException.class)
    public ResponseEntity<String> handleInstanceNotFoundException(InstanceNotFoundException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
