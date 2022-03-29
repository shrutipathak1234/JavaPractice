package com.geeksforgeeks.String;
// WAP to check whether a given string ends with the contents of another string.
//         String 1 : "Python Exercises"
//         String 2 : "se"
//         Output : false....... because String1 does not end with String2
public class Exercise207 {
    static String s2 = "es";
    public static void main(String[] args) {

        String s1 = "Python Exercises";
        String s3 = "";

        for (int i = s1.length() - 1; i >= s1.length() - s2.length() ; i--) {
            s3 = s3 + s1.charAt(i);
        }
        if (s3.equals(reverseString())){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static String reverseString() {

            String s4="";
            for(int i = s2.length()-1 ; i >=0 ; i--){
                char c = s2.charAt(i);
                s4 = s4 + c;
        }
            return s4;
        }
}








