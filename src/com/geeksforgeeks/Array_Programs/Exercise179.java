package com.geeksforgeeks.Array_Programs;

import java.util.Arrays;

public class Exercise179 {
    private static void find(int[] arr, int findElement){

        boolean value=false;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == findElement){
                value=true;
                break;

            }
        }
        System.out.println("Is " + findElement + " present in the array: " + value);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int find =8;
        System.out.println("Arrays:" +Arrays.toString(arr));
        find(arr,find);
    }
}
