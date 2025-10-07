package com.example.expensetracker.model;

import java.time.LocalDate;

public class Expense {
    private String title;
    private double amount;
    private String category;
    private LocalDate date;
    private int id;  // or Integer id;
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
