package com.geeksforgeeks.String;

public class Exercise196 {

    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "ABCD";
        int ss =compareString(s1, s2);
        if(ss > 0){
            System.out.println("String s1 is greater");
        }
        else if(ss < 0 )
        {
            System.out.println("String s2 is greater");
        }
        else
            System.out.println("String s1 and s2 are equal");

    }

    private static int compareString(String s1, String s2) {
        boolean flag = true;
        char c1 = '\n';
        char c2 = '\n';
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != c2) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            return 0;
        } else {
            int result = c1-c2;
            return result;
        }
    }
}

