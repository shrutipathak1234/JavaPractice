package com.SelfPractice.Section3;

//WAP to input a number print the separate digits of that number.
import java.util.Scanner;
public class Exercise92 {
    public static void main(String args[])
    {
        int n, temp, digit, count=0;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter any number: ");
    n=sc.nextInt();
    temp=n;
    while(temp > 0)
    {
        digit=temp%10;
        System.out.println("Digit at place "+count+" is: "+digit);
        temp=temp/10;
    }
}}

