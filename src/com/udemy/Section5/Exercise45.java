package com.udemy.Section5;

public class Exercise45 {
    public static void main(String[] args) {

        isPerfectNumber(28);
    }
        public static boolean isPerfectNumber (int number) {
            int sum =0;

            if(number > 0) {
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        sum = sum + i;
                    }
                }
            }

            if(sum > 1) {
                System.out.println(sum);
                return true;
            }

            return false;
        }

    }

