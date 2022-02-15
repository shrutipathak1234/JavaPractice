package com.SelfPractice.Section11;
// WAP to print the following pattetn.
//                       #
//                       # #
//                       # # #
//                       # # # #
//                       # # # # #
//                       # # # #
//                       # # #
//                       # #
//                       #
public class Exercise107 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print("#");
        }
            System.out.println();

        }
            int row = 4;
            for ( int i = 1; i <= 4; i++) {

                for (int j = i; j <= 4; j++) {
                    System.out.print("#");
                }
                    System.out.println();


}}}