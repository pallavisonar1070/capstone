package com.projects.backend.exceptions;

import lombok.Getter;

@Getter
public class ProductNotFoundException extends RuntimeException{
    private Long id;

    public ProductNotFoundException(Long id, String message) {
        super(message);
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
