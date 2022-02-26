package com.geeksforgeeks.BasicPrograms;

import java.util.Scanner;

//Java Program to Read The Number From Standard Input
public class Exercise127 {
    public static void main (String [] args){
        System.out.print("Enter the Number ");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Entered Number is : " +number);

    }

}
