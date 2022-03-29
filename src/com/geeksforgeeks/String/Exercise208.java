package com.geeksforgeeks.String;
//WAP to replace each substring of a given string that matches the given regular expression with the given replacement.
//Sample string : "The quick brown fox jumps over the lazy dog."
//In the above string replace all the fox with cat.
public class Exercise208 {
    public static void main(String[] args){
        String s1 = "The quick brown fox jumps over the lazy dog.";
        String s2 = "fox";
        String s3 = "cat";
        for(int i = 0 ; i < s1.length()-1 ; i++){
            if(s2 == s1){
                s1 = s3 ;
            }
        }
        System.out.println("Added : "+s1);

    }
}
