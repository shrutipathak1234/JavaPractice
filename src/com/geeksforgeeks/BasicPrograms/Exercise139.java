package com.geeksforgeeks.BasicPrograms;
//Java Program to Check whether input character is vowel or consonant
public class Exercise139 {
    public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}

