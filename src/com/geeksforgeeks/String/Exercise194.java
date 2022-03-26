package com.geeksforgeeks.String;

public class Exercise194 {
    public static void main(String[] args){

        String str="Shruti", ss="";
        System.out.println("Original String : "+str);
        for (int i = str.length()-1 ; i >= 0; i--){
            char c = str.charAt(i);
            ss = ss+c;

        }
        System.out.println("Reverse String : "+ss);

    }
}
