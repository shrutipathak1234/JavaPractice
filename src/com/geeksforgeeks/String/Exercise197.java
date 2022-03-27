package com.geeksforgeeks.String;

import java.util.Scanner;

public class Exercise197 {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Two Numbers for Addition : ");
        int a = ss.nextInt();
        int b = ss.nextInt();
       int result = addTwoNumbers(a,b);
        System.out.println("Sum of a and b : "+result);

    }
    private static int addTwoNumbers(int a , int b){
        int sum =0;
        sum = a + b ;
        return sum;


    }


}
