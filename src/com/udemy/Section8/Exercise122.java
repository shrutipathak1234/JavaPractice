package com.udemy.Section8;
import java.util.ArrayList;

public class Exercise122 {
    public static void main(String[] args) {
        int n = 123456;
        Integer nobj = n;  //Autoboxing
        String str = nobj.toString();
        System.out.println(str.length());
        System.out.println(n+ " "+nobj);
        Integer obj1=500;
        int p=obj1; // Unboxing
        System.out.println(p+ " "+obj1);

    }
}