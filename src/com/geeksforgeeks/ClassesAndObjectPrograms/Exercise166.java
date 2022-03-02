package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Show Usage of Static keyword in Class
public class Exercise166 {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String args[]){
        int result=Exercise166.cube(8);
        System.out.println(result);
    }
}
