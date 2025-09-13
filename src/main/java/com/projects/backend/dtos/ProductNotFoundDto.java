package com.projects.backend.dtos;


public class ProductNotFoundDto {
    Long errorCode;
    String message;

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
