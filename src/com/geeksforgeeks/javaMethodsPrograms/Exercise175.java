package com.geeksforgeeks.javaMethodsPrograms;
//Java Short equals() Method
public class Exercise175 {
    public static void main(String[] args) {

        Short sObject1 =  55;
        Short sObject2 = 55;
        Short sObject3 = 556;


        boolean result = sObject1.equals(sObject2);
        System.out.println("short Obj1 "+sObject1+" and short Obj2 "+sObject2+"  are same : " + result);
        boolean result2 = sObject1.equals(sObject3);
        System.out.println("short Obj1 "+sObject1+" and short Obj2 "+sObject2+"  are same : " + result2);
    }
}
