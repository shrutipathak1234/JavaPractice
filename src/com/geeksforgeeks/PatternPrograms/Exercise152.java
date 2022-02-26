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
    public static void main(String[] args) {
        int row=7;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<i; j++)
                System.out.print(" ");
            for(int j=i; j<row; j++)
                System.out.print("* ");
            System.out.println();
        }
            }
        }
