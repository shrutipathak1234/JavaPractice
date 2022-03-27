package com.geeksforgeeks.String;

import java.util.Scanner;

public class Exercise198 {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Two Numbers for Addition : ");
        int a = ss.nextInt();
        int b = ss.nextInt();
        addTwoNumbers(a,b);


    }
    private static void addTwoNumbers(int a , int b){
        int sum =0;
        sum = a + b ;
        System.out.println("Sum of a and b : "+sum);
    }
}
