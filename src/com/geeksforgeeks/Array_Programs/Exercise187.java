package com.geeksforgeeks.Array_Programs;

import java.util.ArrayList;

public class Exercise187 {
    public static void main(String [] args){
        int [] arr= new int[]{1,2,3,4,5};
        int [] srr= new int[]{1,2,3,4,12};

        ArrayList<Integer> result = new ArrayList<>();
;        for (int i=0; i < 5 ; i++ ){
            if(arr[i]==srr[i]){
                result.add(arr[i]);
            }
        }
        for(int i = 0; i < result.size() ; i++){
            System.out.println("New Array :"+result.get(i));
        }
    }
}
