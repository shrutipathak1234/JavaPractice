package com.SelfPractice.Section11;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

//WAP to take 2 numbers from user and print the result after raising first number to another.
public class Exercise79 {
    public static void main(String[] args)
        {
            int first, second;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the first Number: ");
            first=sc.nextInt();
            System.out.print("Enter the Second Number: ");
            second = sc.nextInt();
            int pow= (int) power(first, second);

            System.out.println(first +" to the power " +second + " is: "+pow);
        }
    }


