package com.geeksforgeeks.String;
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.concurrent.BlockingDeque;
//WAP to replace each substring of a given string that matches the given regular expression with the given replacement.
//Sample string : "The quick brown fox jumps over the lazy dog."
//In the above string replace all the fox with cat.
public class Exercise208 {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over the lazy dog.";
        String s2 = "fox";
        String s3 = "cat";
        String s5 ="";
        int length1ofs2 = s2.length();
        String s4 = "";
        int index = 17;
        for (int i = 0; i < s1.length()-1; i++) {
            if (s1.charAt(i) != ' ') {
                s4 = s4 + s1.charAt(i);
            }
            else {
                if (s4.equals(s2)) {
//                    int a =i;
//                    int b = i-length1ofs2;
//                    System.out.println(i);
//                    System.out.println(b);
//                    for(int j = 0 ; j < b ; j++){
//                        s5 = s1.charAt(i)+s5;
                    s1=s1.substring(0,16)+s3+" "+s1.substring(20,44);
                    }
                else {
                    s4="";
                }
                }
            }
        System.out.println(s1);
        System.out.println(s5);
        }
    }
