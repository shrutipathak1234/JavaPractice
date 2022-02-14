package com.SelfPractice.Section3;
//WAP to take a number from user and print it's table.
import java.util.Scanner;

public class Exercise78 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = ss.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(+number+ "*" +i +"=" +number*+i);
        }
    }
}
