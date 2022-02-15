package com.SelfPractice.Section11;

import java.util.Scanner;

//WAP that reads 10 integers and print their sum.
public class Exercise89 {
    public static void main(String[] args){
        printSum();

    }
    public static void printSum(){
        int sum=0;
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the number: ");
        for (int i=1;i<=10;i++) {
            int number = ss.nextInt();
            sum = sum + i;
            System.out.println(sum);
        }
        }}

