package com.SelfPractice.Section11;

//WAP to print the factorial of a number
public class Exercise81 {
    public static void main(String[] args) {

        System.out.println(Exercise81.factorialUsingForLoop(5));
    }
        public static long factorialUsingForLoop ( int n){
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

