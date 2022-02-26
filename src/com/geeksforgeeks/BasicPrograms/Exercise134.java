package com.geeksforgeeks.BasicPrograms;
//Java Program to Find Largest Among 3 Numbers
public class Exercise134 {
    public static void main(String[] args) {
        findLargest(100,35,30);
    }

    public static int findLargest(int number1, int number2, int number3) {

        if (number1>number2 && number1>number3){
            System.out.println("Largest Number is " +number1);
            return number1;
        }
        if(number2>number1 && number2>number3){
            System.out.println("Largest Number is " +number2);
            return number2;
        }
        else
        {
            System.out.println("Largest Number is " +number3);
            return number3;
        }

    }

}

