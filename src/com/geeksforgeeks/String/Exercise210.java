package com.geeksforgeeks.String;
//WAP to find the second most frequent character in a given string.
//The given string is: successes
//Second most frequent char : c
public class Exercise210 {
    public static void main(String[] args) {
        String s1 = "successes";
        String s2 = "";
        int count = 0;
        for (int i = 0; i < s1.length() - 1; i++) {
            s2 = s2 + s1.charAt(i);

            if (s1.charAt(i) == s1.charAt(i + 1)) {
                System.out.println("Equal");
                count++;
                System.out.println(count);
                System.out.println(s2);
            }
            else {
                i = i+2;
            }
        }
    }
}