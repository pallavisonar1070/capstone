package com.projects.backend.exceptions;

public class ProductNotFoundException extends Exception{
    private Long id;
    public  ProductNotFoundException(Long id, String message){
        super(message);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
