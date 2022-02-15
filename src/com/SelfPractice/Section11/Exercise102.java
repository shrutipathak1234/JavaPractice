package com.SelfPractice.Section11;
// WAP to print the following pattern.
//      # # # # #
//      # # # #
//      # # #
//      # #
//      #
public class Exercise102 {
    public static void main(String[] args) {
        int i, j, row = 5;
        for ( i = 1; i <= 5; i++) {

            for (j = i; j <= 5; j++) {
                System.out.print(" # ");
            }
            System.out.println();

        }
            for (j = 0; j <= i; j++) {

                System.out.print(" ");
            }

            System.out.println();
        }
    }




