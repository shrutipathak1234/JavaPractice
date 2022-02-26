package com.geeksforgeeks.BasicPrograms;

//Java Program to Swap Two Numbers
public class Exercise130 {
    public static void main(String [] args) {
       swap(10,50);
    }
    public static void swap(int number1,int number2) {
        System.out.println("Before swap: " + number1 +" " +number2);
        int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After Swap: " + number1 +" " +number2);

    }
}
