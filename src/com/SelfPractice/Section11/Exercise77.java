package com.SelfPractice.Section11;
//WAP to print the first 10 odd and first 10 even numbers.
public class Exercise77 {
    public static void main(String[] args) {
        int number;
        int count=0;
        for (number = 0; number <= 50; number++)
         if(number%2==0 ) {
             System.out.println("Even Numbers " + number);
             count++;
             while(count==10) {
             }

         }
        else if(number%2!=0){
             System.out.println("Odd Numbers " + number);
             count++;
             while(count==20) {
             }

         }


    }
}




