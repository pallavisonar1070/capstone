package com.projects.backend.dtos;

import lombok.Getter;

@Getter
public class ProductNotFoundDto {
    Long errorCode;
    String message;

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
