package com.geeksforgeeks.PatternPrograms;
import java.util.Scanner;
//Java Program to Print Mirror Lower Star Triangle Pattern
//* * * * * * *
// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
//* * * * * * *
public class Exercise169 {
    public static void main(String args[]) {
        int i, j, k, row;
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        row = my_scanner.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= row; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (i = row - 1; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= row - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

