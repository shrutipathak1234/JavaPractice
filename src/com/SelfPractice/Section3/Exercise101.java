package com.SelfPractice.Section3;
// WAP to print the following pattern.
//      #
//      # #
//      # # #
//      # # # #
//      # # # # #
public class Exercise101 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" # ");
            }

            System.out.println();
        }

    }
    }
