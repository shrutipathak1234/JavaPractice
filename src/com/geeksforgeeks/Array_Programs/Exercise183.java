package com.geeksforgeeks.Array_Programs;

public class Exercise183 {
    static int[]  arr= new int[8];
    public   int removeDuplicates ( int array[], int n){
            if (n == 0 || n == 1) {
                return n;
            }
            int j = 0;
            for (int i = 0; i < n-1; i++) {
                if (array[i] != array[i + 1]) {
                    arr[j++] = array[i];
                }
            }
            arr[j++] = array[n-1];
            return j;
        }
        public static void main (String[]args){
            int array[] = {18, 18, 25, 25, 25, 28, 28, 29};
            int length = array.length;
            new Exercise183().removeDuplicates(array,length);

            for (int i = 0; i < length; i++)
                if(arr[i] != 0){
                System.out.print(arr[i] + " ");
        }}

    }
