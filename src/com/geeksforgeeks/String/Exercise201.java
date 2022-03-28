package com.geeksforgeeks.String;

public class Exercise201 {
    public static void main(String[] args) {
        String s1 = "GeeksGeeks", s2 = "" , s3 ="For";
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {

            if(i == index){
                s2 = s2+s3;
            }

            s2= s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}