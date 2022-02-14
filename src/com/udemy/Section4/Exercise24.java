package com.udemy.Section4;
//DecimalComparator
//Coding Exercises
public class Exercise24 {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int a = (int) one * 1000;
        int b = (int) two * 1000;

        if(a == b){
            System.out.println(true);
            return true;
        }
        else

            System.out.println(false);
        return false;
    }
}
