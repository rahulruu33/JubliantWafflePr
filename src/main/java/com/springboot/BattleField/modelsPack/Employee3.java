package com.springboot.BattleField.modelsPack;

public class Employee3 {
    private String name;
    private int age;
    private int annualSalary;
    private String dept;

    // Constructor
    // Constructor for name and age
    public Employee3(String name, int age, boolean isAge) {
        this.name = name;
        if (isAge) {
            this.age = age;
        }
    }

    // Constructor for name and annualSalary
    public Employee3(String name, int annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
    }

    public Employee3(String name, int age, int annualSalary, String dept) {
        this.name = name;
        this.age = age;
        this.annualSalary = annualSalary;
        this.dept = dept;
    }

    // Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

