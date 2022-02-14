package com.SelfPractice.Section3;
//10. WAP to find the sum of the following series upto n numbers. 1/2 + 2/3 + 3/4 + 4/5 +....
public class Exercise84 {
    public static void main(String[] args) {
        System.out.println(printSumOfNumberInFraction(10));
    }

    private static double printSumOfNumberInFraction ( int n){
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (i/i+1.0);
        }
        return sum;
    }

}
