package com.geeksforgeeks.javaMethodsPrograms;
//Java Program to Show Use of Static and Non-static Methods
public class Exercise172 {

    public static void main(String args[]) {
        Tiger.roar();
        Tiger tiger = new Tiger();
        tiger.eat();
    }
}
class Tiger {
    public void eat() {
        System.out.println("Non Static Method");
    }

    public static void roar() {
        System.out.println("Static Method");
    }
}