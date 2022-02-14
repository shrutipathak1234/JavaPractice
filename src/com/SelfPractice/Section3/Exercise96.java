package com.SelfPractice.Section3;
//WAP to check whether a number is palindrome or not.
//121 is a Palindrome number
public class Exercise96 {
    public static void main(String[] args) {
        int n = 121;
        int reverse = 0;
        int temp = 0;
        int originalNumber = n;
        while (n > 0) {
            temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;
        }
        if (originalNumber == reverse)
            System.out.println("Plaindrome Number is " +reverse);

        else {
            System.out.println("Not a Plaindrome Number : "+reverse);
        }
    }

}