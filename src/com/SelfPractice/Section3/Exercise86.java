package com.SelfPractice.Section3;

import java.util.Scanner;

//Compute the natural logarithm of 2, by adding up to n terms in the series
//1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
public class Exercise86 {
    public static void main(String[] args){
        printExpression();
    }
    private static void printExpression ( ) {
        int product = 1;
        double sum = 0;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = ss.nextInt();
        for (int i =1;i<=number;i++){
            sum =sum +1.0/(i*product);
            product=(-1)*product;
        }
        System.out.println(sum);
    }
}
