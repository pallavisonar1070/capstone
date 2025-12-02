package com.projects.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel{
    String description;
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
//    List<Product> productList;
//    @ManyToMany
//    List<Product> productList2;
}
