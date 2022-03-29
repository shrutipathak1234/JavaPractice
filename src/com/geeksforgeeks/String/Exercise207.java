package com.geeksforgeeks.String;
// WAP to check whether a given string ends with the contents of another string.
//         String 1 : "Python Exercises"
//         String 2 : "se"
//         Output : false....... because String1 does not end with String2
public class Exercise207 {
    static String s2 = "se";
    public static void main(String[] args) {

        String s1 = "Python Exercises";
        String s3 = "";

        for (int i = s1.length() - 1; i >= s1.length() - s2.length() ; i--) {
            s3 =s1.charAt(i)+s3;
        }
        if(s3.equals(s2)){
            System.out.println("True");
        }

        else {
            System.out.println("False");
        }
    }

}









