package com.geeksforgeeks.BasicPrograms;
//Java Program to Find Even Sum of Fibonacci Series Till number N
public class Exercise146 {
    public static void main(String [] args) {
        int a;
        int b = 0;
        int c = 1;

        for (int i = 0; i < 20; i++) {
            a = b;
            b = c;
            c = a + b;

            if ( c % 2 == 0) {
                int sum = 0;
                sum = sum + c;
                System.out.println(sum);
            }
        }
    }
}
