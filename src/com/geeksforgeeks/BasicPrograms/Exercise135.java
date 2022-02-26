package com.geeksforgeeks.BasicPrograms;
//Java Program to Display All Prime Numbers from 1 to N
public class Exercise135 {

        static void Exercise135(int N)
        {

            int i, y, flag;
            System.out.println(
                    "All the Prime numbers within 1 and " + N + " are:");

            for (i = 1; i <= N; i++) {
                flag = 0;

                for (y = 1; y <= i; y++) {
                    if (i % y == 0) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 1)
                    System.out.print(i + " ");
            }
        }


        public static void main(String[] args)
        {
            int N = 1000;

            Exercise135(N);
        }
    }

