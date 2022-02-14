package com.SelfPractice.Section3;
//WAP to print the following pattern.
//                                        #
//                                      # #
//                                    # # #
//                                  # # # #
//                                # # # # #
//                                  # # # #
//                                    # # #
//                                      # #
//                                        #
public class Exercise108 {
    public static void main(String[] args) {
        int i, j, row = 5;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
        int row2 = 4;
        int var=1;
        for ( int ii = 1; ii <= 4; ii++) {

            for (int jj = 1; jj <= ii; jj++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= ii;k--){
                System.out.print("#");
            }
            System.out.println();



        }}

    }

