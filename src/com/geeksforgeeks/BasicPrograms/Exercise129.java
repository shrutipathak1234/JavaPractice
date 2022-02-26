package com.geeksforgeeks.BasicPrograms;
//Java Program to Multiply Two Floating-Point Numbers
public class Exercise129 {
    public static void main(String [] args) {
        System.out.print("Product of float number : "+mult(10.5f,5.5f));
    }
    public static float mult(float firstnumber , float secondtnumber){
        float multipy=1;
        multipy=firstnumber*secondtnumber;
        return multipy;
    }
}
