package com.geeksforgeeks.Array_Programs.TwoDimensional;

import java.util.Scanner;

public class Exercise189 {
    public static void main(String[] args){
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the no. of rows :");
        int row = ss.nextInt();
        System.out.println("Enter the no. of cols :");
        int col = ss.nextInt();
        int[][] first = new int[row][col];
        int[][] second = new int[row][col];
        int[][] third = new int[row][col];
        for(int i=0; i < row ; i++){
            for(int j=0 ; j < col ; j++){
                first[i][j]=ss.nextInt();
            }
        }
        for(int i=0; i < row ; i++){
            for(int j=0 ; j < col ; j++){
                second[i][j]=ss.nextInt();
            }
        }
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                third[i][j] = first[i][j] + second[i][j];
            }
        }
        for(int i=0; i < row ; i++){
            for(int j=0 ; j < col ; j++){
                System.out.print(third[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
