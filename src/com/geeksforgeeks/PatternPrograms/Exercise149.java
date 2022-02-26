package com.geeksforgeeks.PatternPrograms;

//WAP to print
//        1
//      2 3 2
//    3 4 5 4 3
//  4 5 6 7 6 5 4
//5 6 7 8 9 8 7 6 5
public class Exercise149 {
    public static void main(String[] args) {
        int i, j, row = 5, a=0,s=0;
        for (i = 1; i <= row; i++) {
            for (j = row - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = i; j <= a + i; j++) {
                System.out.print(j);
            }
            a++;

                for(int l=2;l<=i+s;l++) {
                    System.out.print(l);
                }
                System.out.println();
        }

    }

}
