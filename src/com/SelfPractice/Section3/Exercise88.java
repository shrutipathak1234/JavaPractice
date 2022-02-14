package com.SelfPractice.Section3;

import java.util.Scanner;

//WAP that reads 10 integers and print the count of odd numbers.
public class Exercise88 {
    public static void main(String[] args){
        readOddNumbers();

    }
    public static void readOddNumbers(){
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the number: ");
        for (int i=1;i<=10;i++)
        {
            int number =ss.nextInt();
            if(number % 2 !=0){
                System.out.println(number);
            }
        }}

}
