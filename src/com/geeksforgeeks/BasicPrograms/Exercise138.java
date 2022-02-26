package com.geeksforgeeks.BasicPrograms;
//WAP to check Neon Number
import java.util.Scanner;

public class Exercise138 {
    public static void main(String[] args)
    {
        int n,square,sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: " );
        n=sc.nextInt();

        square=n*n;

        while(square>0)
        {
            sum=sum+square%10;
            square=square/10;
        }
        if(sum==n)
            System.out.println("Its a Neon number.");
        else
            System.out.println("Its not a Neon number.");
    }
}
