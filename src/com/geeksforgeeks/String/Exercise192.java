package com.geeksforgeeks.String;

public class Exercise192 {
    public static void main(String[] args){
        String string="Shruti";
        int index=1;

        char c = getCharFromString(string,index);
        System.out.println("The String "+string+ " at postion "+index+" is :"+c);

    }
    private static char getCharFromString(String string,int index){

        return string.charAt(index);
    }
}
