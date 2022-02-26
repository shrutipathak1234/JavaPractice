package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Create Abstract Class

public class Exercise155 extends AbstractExample {
    public static void main(String[] args) {
        Exercise155 obj = new Exercise155();
        obj.show();
    }

    void show() {
        System.out.println("Abstract Class Example");
    }
}

abstract class AbstractExample {
    abstract void show();
}
