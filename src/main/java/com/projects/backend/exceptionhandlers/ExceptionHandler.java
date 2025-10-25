package com.projects.backend.exceptionhandlers;

import com.projects.backend.dtos.ProductNotFoundDto;
import com.projects.backend.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundDto> handleInstanceNotFoundException(ProductNotFoundException exception) {
        ProductNotFoundDto ProductNotFoundDto = new ProductNotFoundDto();
        ProductNotFoundDto.setErrorCode(exception.getId());
        ProductNotFoundDto.setMessage(exception.getMessage());
        return new ResponseEntity<>(ProductNotFoundDto, HttpStatus.NOT_FOUND);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ProductNotFoundDto> handleNullException(ProductNotFoundException exception) {
        ProductNotFoundDto ProductNotFoundDto = new ProductNotFoundDto();
        ProductNotFoundDto.setErrorCode(exception.getId());
        ProductNotFoundDto.setMessage(exception.getMessage());
        return new ResponseEntity<>(ProductNotFoundDto, HttpStatus.NOT_FOUND);
    }
}
