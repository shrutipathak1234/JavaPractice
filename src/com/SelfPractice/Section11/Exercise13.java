package com.SelfPractice.Section11;

//WAP to check whether a number is positive or not. If it is positive, make it negative without changing it's numerical value.

public class Exercise13 {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = -1;

        if (firstNumber > 0) {
            System.out.println("This is positive number " + firstNumber);
            int newNumber = firstNumber * secondNumber;
            System.out.println("This is negative newnumber after converting the postive to negative number " + newNumber);
        } else {
            System.out.println("This is negative number " + firstNumber);
        }
    }
}
