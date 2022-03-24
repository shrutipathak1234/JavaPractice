package com.geeksforgeeks.Array_Programs;

public class Exercise184 {
    public static void main(String [] args){
        int i , k=0;
        int [] first= new int[]{11,12,13,14,15};
        int [] second= new int[]{21,22,23,24,25};
        int [] resultant = new int[10];
        for(i=0 ; i<5 ; i++ )
            resultant[k++]=first[i];
        for(i=0 ; i<5 ; i++ )
            resultant[k++]=second[i];
        System.out.println("The merged arrays :");
        for(i=0; i<10 ;i++)
            System.out.print(resultant[i]+" ");

    }
}
