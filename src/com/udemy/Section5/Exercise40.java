package com.udemy.Section5;
// Palindrome number
public class Exercise40 {
    public static void main(String[] args) {

        int number = 7227;
        int temp= number;
        int r = 0;
        int sum = 0;
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            sum = sum * 10 + r;
        }
        if(temp==sum){
            System.out.println("Its a  Palindrome Number " +sum);
        }
        else {
            System.out.println("Its not a  Palindrome Number " +sum);
        }
    }
}
