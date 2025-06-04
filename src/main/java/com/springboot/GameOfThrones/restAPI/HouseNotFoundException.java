package com.springboot.GameOfThrones.restAPI;

public class HouseNotFoundException extends RuntimeException{
    public HouseNotFoundException(String message) {
        super(message);
    }
}
