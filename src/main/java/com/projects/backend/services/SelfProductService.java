package com.projects.backend.services;

import com.projects.backend.exceptions.ProductNotFoundException;
import com.projects.backend.models.Category;
import com.projects.backend.models.Product;
import com.projects.backend.projections.ProductTitleAndDesc;
import com.projects.backend.repos.CategoryRepo;
import com.projects.backend.repos.ProductRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
@Primary
public class SelfProductService implements ProductService{
    ProductRepo productRepo;
    CategoryRepo categoryRepo;

    public SelfProductService(ProductRepo productRepo, CategoryRepo categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        //ProductTitleAndDesc productTitleAndDesc = productRepo.getProductTitleAndDesc(id);
        //System.out.println("Projections HQL: " + productTitleAndDesc.getTitle() + ", " + productTitleAndDesc.getDescription());
        //ProductTitleAndDesc productTitleAndDescSql = productRepo.getProductTitleAndDescSQL(id);
        //System.out.println("Projections SQL: " + productTitleAndDesc.getTitle() + ", " + productTitleAndDesc.getDescription());
        return productRepo.findById(id).get();
       // return productRepo.getProductTitleAndDesc(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product replaceProduct(long id, Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
//        Category category = product.getCategory();
//        if(category.getId() == null){
//            Category saveCategory = categoryRepo.save(category);
//            product.setCategory(saveCategory);
//        }else {
//            //check validation
//        }
        return productRepo.save(product);
    }
}
