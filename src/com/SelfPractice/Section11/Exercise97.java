package com.SelfPractice.Section11;

import java.util.Scanner;

//WAP to print only even numbers that user enters until he enters an odd number. Use a boolean flag in while loop condition for this program.
public class Exercise97 {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner ss = new Scanner(System.in);

        while (flag ) {

            System.out.println("Enter Number");
            int number = ss.nextInt();
            if (number % 2 == 0) {
                System.out.println("Even number");
            } else if (number % 2 != 0) {
                flag = false;
            }

        }
    }

}

