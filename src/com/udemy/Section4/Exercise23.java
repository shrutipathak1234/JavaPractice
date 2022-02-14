package com.udemy.Section4;
//leap Year Calculator
//Coding Exercises
public class Exercise23 {
    public static void main(String[] args) {
        // The desired year to check.
        int year = 2024;

        // Logic
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
