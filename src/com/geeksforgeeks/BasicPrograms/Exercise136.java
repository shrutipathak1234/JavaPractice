package com.geeksforgeeks.BasicPrograms;
import java.util.Scanner;
//Java Program to Check Armstrong Number between Two Integers
public class Exercise136 {

    public static void main(String args[]){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        num2 = sc.nextInt();

        for (int i = num1; i<num2; i++){
            int number, rem, sum = 0;
            number = i;
            while(number != 0) {
                rem = number % 10;
                sum = sum + (rem * rem * rem);
                number = number / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
            else{
                System.out.println(""+i+" is not a Armstrong number.");
            }
        }
    }
    }


