package com.projects.backend.repos;

import com.projects.backend.models.Product;
import com.projects.backend.projections.ProductTitleAndDesc;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query("select p.title as title, p.description from Product p where p.id = :id")
    ProductTitleAndDesc getProductTitleAndDesc(@Param("id") Long id);

    @Query(value = "select title, description from product where id = :id", nativeQuery = true)
    ProductTitleAndDesc getProductTitleAndDescSQL(@Param("id") Long id);


    List<Product> findByTitleContains(String keyword, Pageable pageable);
}
