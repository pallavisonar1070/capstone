package com.projects.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    String description;
    double price;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    Category category;
//    @ManyToMany(mappedBy = "product")
//    List<Category> categoryList;
}
