package com.SelfPractice.Section3;
//WAP to reverse a number.
public class Exercise94 {
    public static void main(String[] args) {

        int num = 1234, reversed = 0;
        System.out.println("Original Number: " + num);
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

}
