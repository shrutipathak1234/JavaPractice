package com.SelfPractice.Section11;

import java.util.Scanner;

// WAP that reads 10 integers and print only even numbers.
public class Exercise87 {
    public static void main(String[] args){
        readEvenNumbers();

    }
    public static void readEvenNumbers(){
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the number: ");
        for (int i=1;i<=10;i++)
        {
            int number =ss.nextInt();
            if(number % 2 ==0){
            System.out.println(number);
        }
    }}

}
