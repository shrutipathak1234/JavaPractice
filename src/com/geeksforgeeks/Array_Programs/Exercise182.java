package com.geeksforgeeks.Array_Programs;

public class Exercise182 {
    public static void main(String[] args) {

        int[] arr = new int[]{50, 40, 30, 20, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array without sorting : " + arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array after sorting : " + arr[i]);

        }

    }
}
