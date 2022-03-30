package com.geeksforgeeks.String;

//WAP to check whether a string is palindromic or not.
public class Exercise209 {
    public static void main(String[] args){
        {
            String a, b = "";
            String ss ="wow";
            int n = ss.length();
            for(int i = n - 1; i >= 0; i--)
            {
                b = b + ss.charAt(i);
            }
            if(ss.equalsIgnoreCase(b))
            {
                System.out.println("The string is palindrome.");
                System.out.println(b);
            }
            else
            {
                System.out.println("The string is not palindrome.");
                System.out.println(b);
            }
        }

    }
}
