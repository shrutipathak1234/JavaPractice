package com.geeksforgeeks.String;
//WAP to check if two strings are same or not.
//String1 : This is an example.
//String2 : This is an example.
public class Exercise205 {

    public static void main(String[] args){
        boolean flag = true;
        char c1 = '\n';
        char c2 = '\n';
        String s1="This is an examples.";
        String s2="This is an example.";

        for(int i = 0 ; i<=s1.length()-1 ; i++){
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if(c1!=c2){
                flag = false;
                System.out.println("String are not equal");
                break;

            }

        }
        if(flag==true){
            System.out.println("String are equal");
        }


    }

}
