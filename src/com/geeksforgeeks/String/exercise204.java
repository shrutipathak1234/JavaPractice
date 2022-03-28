package com.geeksforgeeks.String;
//WAP to reverse a sentence.
//Input : This is an example
//Output : example an is This
public class exercise204 {
    public static void main(String args[]) {
        String s[] = "This is an example".split(" ");
        String result = "";
        for (int i = s.length - 1; i >= 0; i--) {
            result += s[i] + " ";
        }
        System.out.println("Reversed String: " + result);
    }
}
