package com.geeksforgeeks.Array_Programs.TwoDimensional;

public class Exercise190 {
    public static void main(String[] args) {
        int sum =0 ;
        int[][] arr= {{1,2},{3,4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(i==j){
                   sum += arr[i][j];
                }

            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(i==(2-j-1)){
                    sum += arr[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}