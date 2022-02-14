package com.udemy.Section5;
//Switch Case
public class Exercise31 {
    public static void main(String[] args) {
        char value = 'B';
        switch (value) {
            case 'A':
            System.out.println("Its A");
            break;
            case 'B':
                System.out.println("Its B");
                break;
            case 'C':
                System.out.println("Its C");
                break;
            case 'D':
                System.out.println("Its D");
                break;
            case 'E':
                System.out.println("Its E");
                break;
            default:
                System.out.println("Could not find any");
                break;
        }

    }
}