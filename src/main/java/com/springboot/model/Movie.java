package com.springboot.model;

public class Movie {
    private String name;
    private String imageUrl;

    public Movie(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

