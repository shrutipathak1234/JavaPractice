package com.geeksforgeeks.Array_Programs.TwoDimensional;

public class Exercise191 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){

                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){
                arr[i][j]=arr[j][i];

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}