package com.udemy.Section5;

public class Exercise41 {
    public static void main (String [] args){
        sumFirstAndLastDigit(252);

    }

        public static int sumFirstAndLastDigit(int number){
            int lastDigit = 0;
            int sum=0;
            if(number >= 0){
                lastDigit = number % 10;

                while (number > 9){
                    number = number / 10;

                }
                sum = number + lastDigit;
                System.out.println("First Number " + number + " Last Number " + lastDigit + " Total = " + (sum));

                return sum;
            } else

                System.out.println("-1");
            return -1;
        }
}


