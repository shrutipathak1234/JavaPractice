package com.geeksforgeeks.BasicPrograms;
//Java Program to Find Factorial of a number
public class Exercise140 {


    public static void main(String[] args) {

        System.out.println(factorialUsingForLoop(5));
    }
    public static long factorialUsingForLoop ( int n){
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
