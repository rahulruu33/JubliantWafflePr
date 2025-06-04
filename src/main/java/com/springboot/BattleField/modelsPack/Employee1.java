package com.springboot.BattleField.modelsPack;

public class Employee1 {
    private String ename; // Employee Name
    private double esalary; // Employee Salary

    // Constructor
    public Employee1(String ename, double esalary) {
        this.ename = ename;
        this.esalary = esalary;
    }

    // Getters
    public String getEname() {
        return ename;
    }

    // Setters (if needed)
    public void setEname(String ename) {
        this.ename = ename;
    }



    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    // Override toString() for easier output
    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", esalary=" + esalary +
                '}';
    }
}

