package com.SelfPractice.Section11;

import java.util.Scanner;

//WAP to take a number input from user and check whether it is prime or not
public class Exercise80 {

    public static void main(String[] args){
        int num, i, count=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }

        if(count==0)
            System.out.println("\nIt is a Prime Number.");
        else
            System.out.println("\nIt is not a Prime Number.");
    }
}