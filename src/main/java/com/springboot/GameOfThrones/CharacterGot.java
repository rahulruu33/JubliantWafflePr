package com.springboot.GameOfThrones;

public class CharacterGot {
    private String name;
    private String house;
    public CharacterGot(String name, String house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }
    public String introduce() {
        return "I am " + name + " of House " + house + ".";
    }

}


