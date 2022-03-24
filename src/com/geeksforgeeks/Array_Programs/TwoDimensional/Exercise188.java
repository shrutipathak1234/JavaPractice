package com.geeksforgeeks.Array_Programs.TwoDimensional;

import java.util.Scanner;

public class Exercise188 {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the no. of rows :");
        int row = ss.nextInt();
        System.out.println("Enter the no. of cols :");
        int col = ss.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Enter the data :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = ss.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}