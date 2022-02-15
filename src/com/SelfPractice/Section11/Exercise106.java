package com.SelfPractice.Section11;
//WAP to print the following pattern.
//                       #
//                       # # #
//                       # # # # #
//                       # # # # # # #
//                       # # # # # # # # #
public class Exercise106 {

        public static void main(String[] args) {
            int var=1;
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <=var; j++) {
                    System.out.print(" # ");
                }
                    var= var+2;
                System.out.println();
            }

        }
}
