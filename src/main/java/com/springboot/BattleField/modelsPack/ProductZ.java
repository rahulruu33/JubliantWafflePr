package com.springboot.BattleField.modelsPack;

public class ProductZ {
    private String name;
    private double price;
    private double rating;
    public ProductZ(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public double getRating() { return rating; }

    @Override
    public String toString() {
        return name + " ($" + price + ", Rating: " + rating + ")";
    }
}
