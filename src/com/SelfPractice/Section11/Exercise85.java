package com.SelfPractice.Section11;

import java.util.Scanner;

//WAP to calculate the sum of following series where n is input by user.
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
public class Exercise85 {
    public static void main(String[] args) {


        printSumOfNumberInFraction();

    }
    private static void printSumOfNumberInFraction ( ) {
        int sum = 0;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = ss.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.println(sum);

    }
}
