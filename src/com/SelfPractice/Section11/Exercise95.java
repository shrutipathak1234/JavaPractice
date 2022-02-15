package com.SelfPractice.Section11;

//WAP to check whether a number is Armstrong or not.
//143=(1)3+(4)3+(3)3
public class Exercise95 {
    public static void main(String[] args) {
        int sum = 0;
        int temp=0;
        int n = 153;
        int originalnumber=n;

        while (n > 0) {
            temp = n % 10;
            n = n / 10;

            System.out.println("Number " + temp);
            sum = sum + temp*temp*temp;
            System.out.println("Sumsum =  " +sum);
        }
        if(originalnumber==sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }


    }
}