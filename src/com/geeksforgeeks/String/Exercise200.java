package com.geeksforgeeks.String;

public class Exercise200 {
    private static void stringWords(String string){

        for (String word : string.split(" "))
            if(word.length() % 2==0){
                System.out.println(word);
            }
        }

    public static void main (String[] args){

        String string = "I am in love with the greenery";
        stringWords(string);

    }
}
