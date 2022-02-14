package com.udemy.Section4;
//barking Dogs
//Coding Exercises
public class Exercise22 {


    public static boolean isLeapYear(int year){
        if(year < 1 && year > 9999){
            return false;
        } else if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)){
            return true;
        } else {
            return false;
        }
    }
    }

