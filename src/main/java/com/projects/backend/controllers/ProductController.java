package com.projects.backend.controllers;

import com.projects.backend.dtos.ProductNotFoundDto;
import com.projects.backend.exceptions.ProductNotFoundException;
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

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
        Product product = productService.getProductById(id);

        ResponseEntity<Product> productResponseEntity;
        productResponseEntity = new ResponseEntity<>(product, HttpStatus.OK);
        return productResponseEntity;
    }

    @GetMapping()
    public List<Product> getAllProduct() {
        return productService.getAllProducts();
    }

    @PutMapping("{id}")
    public Product replaceProduct(@PathVariable("id") long id, @RequestBody Product product) {
        return productService.replaceProduct(id, product);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundDto> handleInstanceNotFoundException(ProductNotFoundException exception) {
        ProductNotFoundDto productNotFoundDto =
                new ProductNotFoundDto();
        productNotFoundDto.setMessage(exception.getMessage());
        productNotFoundDto.setErrorCode(exception.getId());
        return new ResponseEntity<>(productNotFoundDto, HttpStatus.NOT_FOUND);
    }
}
