package com.projects.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    String description;
    double price;
    @ManyToOne
    @JoinColumn
    Category category;
//    @ManyToMany(mappedBy = "product")
//    List<Category> categoryList;
}
