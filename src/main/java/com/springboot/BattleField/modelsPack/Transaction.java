package com.springboot.BattleField.modelsPack;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private double amount;
    private String category;
    private LocalDate date;

    public Transaction(int id, double amount, String category, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getters for all fields (Good practice to include these)

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    // Example Setter (If you need it)
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }


    // Optional: Add setters if you need to modify the transaction details later.  If the Transaction objects are intended to be immutable, you should leave these out.

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {  // Useful for debugging and printing
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", date=" + date +
                '}';
    }


}