package com.springboot.GameOfThrones.restAPI;

public class Character {
    private Long id;
    private String name;
    private String house;

    public Character(Long id, String name, String house) {
        this.id = id;
        this.name = name;
        this.house = house;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
