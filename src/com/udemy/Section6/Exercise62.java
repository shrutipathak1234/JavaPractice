package com.udemy.Section6;

public class Exercise62 {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Exercise62() {
        this("Default name", 50000.00, "default@email.com");
    }
    public Exercise62(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public Exercise62(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
