package com.geeksforgeeks.String;
//WAP to check whether a string contains a specified word.
//String : Today it is sunny and raining.
//Word to check : and
public class Exercise206 {
    public static void main(String[] args){
        String s1="Today it is sunny and raining.";
        String s2="and";
        Boolean bool = s1.contains(s2);
        System.out.println(bool);
        if(bool==true){
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Matched");
        }
        }

    }

