package com.udemy.Section3;

public class Exercise4 {
    public static void main(String[] args) {

    byte byteNumber= 10;
    short shortNumber= 20;
    int intNumber=50;
    long myLongNumber= 50000L + 10L * (byteNumber+shortNumber+intNumber) ;
    System.out.println("My Long Value = " +myLongNumber);
}
}