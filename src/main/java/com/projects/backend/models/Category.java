package com.projects.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel implements Serializable {
    String description;
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
//    List<Product> productList;
//    @ManyToMany
//    List<Product> productList2;
}
