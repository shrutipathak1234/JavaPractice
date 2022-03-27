package com.geeksforgeeks.String;

public class Exercise195 {
    public static String swapString(String ss) {

        char temp;
        char[] arr = ss.toCharArray();

        for (int i = 0; i < arr.length-1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }

        return new String(arr);
    }

        public static void main (String[]args){
            String ss = "GeeksForGeeks";
            System.out.println(swapString(ss));
        }

}