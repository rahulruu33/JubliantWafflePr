package com.springboot.BattleField.modelsPack;

public class Movie {
    private String name;
    private double rating;
    private int releasedYear;

    public Movie(String name, int releasedYear,double rating) {
        this.name = name;
        this.rating = rating;
        this.releasedYear = releasedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }
}
