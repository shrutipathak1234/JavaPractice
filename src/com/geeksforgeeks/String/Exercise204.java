package com.geeksforgeeks.String;
//WAP to reverse a sentence.
//Input : This is an example
//Output : example an is This
public class Exercise204 {
    public static void main(String args[]) {
        String s1 = "This is an example ";
        String s2 = "";
        String s3 = "";
        for (int i = 0; i < s1.length(); i++) {


            if(s1.charAt(i)==' ' )
            {
                s3 = s2+" "+s3;
                s2 = "";

            }
        else{
                s2 = s2 + s1.charAt(i);
            }

            }
        System.out.println(s3);
        }

        }
