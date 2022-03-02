package com.geeksforgeeks.PatternPrograms;
//WAP to print :
//**********************
//*                    *
//*                    *
//*                    *
//*                    *
//*                    *
//*                    *
//**********************
public class Exercise170 {
    public static void main(String[] args) {
        int row =6; int col =20;
        for (int i = 1; i <= 20; i++) {
            System.out.print("*");


        }
        for (int j = 1; j <= 6; j++) {
            System.out.println("*");
        }

        for (int j = 1; j < 6; j++) {
            for (int k = 6; k >= j; k--) {
                System.out.print("*");
            }
        }
    }
    }
