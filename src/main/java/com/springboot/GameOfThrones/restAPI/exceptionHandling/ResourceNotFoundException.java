package com.springboot.GameOfThrones.restAPI.exceptionHandling;

public class ResourceNotFoundException  extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
