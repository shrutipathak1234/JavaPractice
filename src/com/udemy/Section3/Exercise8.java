package com.udemy.Section3;

public class Exercise8 {
    public static void main(String[] args){
        int a = 10 , b = 10;
        if (a == b) {
            System.out.println("Inside If");
        }
        else{
            System.out.println("Inside Else");
        }

        int result =(a == b) ? 20 : 30;
        System.out.println(result);

    }
}
