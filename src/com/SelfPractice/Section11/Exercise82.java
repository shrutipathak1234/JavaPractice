package com.SelfPractice.Section11;
//WAP to print the sum of the integers from 1 to number. Example input = 5 ouput = 1 + 2 + 3 + 4 + 5 = 15
public class Exercise82 {
    public static void main(String[] args) {

        System.out.println(Exercise82.printSumOfNumber(9));
    }
    public static long printSumOfNumber ( int n){
        long sum = 0;
        for (int i = n; i >= 1; i--) {
            sum = sum + i;
        }
        return sum;
    }

}
