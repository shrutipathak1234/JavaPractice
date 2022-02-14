package com.udemy.Section3;

public class Exercise3 {


    public static void main(String[] args) {

        int myMinValue = Integer.MIN_VALUE;

        short myShortMinValue = Short.MIN_VALUE;

        byte myByteMinValue = Byte.MIN_VALUE;

        int myTotal = myMinValue/2;
        System.out.println("myTotal = " + myTotal);

        byte myNewByteValue = (byte) (myByteMinValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        short myNewShortValue = (short) (myShortMinValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);
    }
}