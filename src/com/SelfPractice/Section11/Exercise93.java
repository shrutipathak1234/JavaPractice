package com.SelfPractice.Section11;

import java.util.Scanner;

//WAP to print the sum of digits of a number.
public class Exercise93{


        public static void main(String args[])
        {
            int sum =0;

            int n, temp, digit, count=0;
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter any number: ");
            n=sc.nextInt();
            temp=n;
            while(temp > 0) {

                digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }
                System.out.println("Sum of Digit of Number "+sum);

            }

}
