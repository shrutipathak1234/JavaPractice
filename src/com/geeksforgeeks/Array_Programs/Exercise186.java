package com.geeksforgeeks.Array_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise186 {
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] arr = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6};
//        int[] temp = new int[12];
        int key= 1;
        int k=0;
        for (int i = 0; i < 11; i++) {
            if (arr[i] != key) {
                temp.add(arr[i]);
            }
        }
        for(int i =0 ; i< temp.size() ; i++)
        System.out.println("New Array : "+temp.get(i));
    }
}