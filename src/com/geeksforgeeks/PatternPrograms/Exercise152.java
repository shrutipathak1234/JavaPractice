package com.geeksforgeeks.PatternPrograms;

//WAP to print
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
//* * * * * * *
//* * * * * * *
// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
public class Exercise152 {

        public static void main(String args[])
        {
            int row=9, i, j;
            for (i = 0; i <= row; i++) {
                for (j = 1; j <= row-i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            for (i = row-1; i >=1; i--) {
                for (j = 1; j <= row-i; j++) {
                    System.out.print(" ");
                }

                for (j = 0; j <= 2 * (i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }}