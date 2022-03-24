package com.geeksforgeeks.Array_Programs;

public class Exercise185 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] first = new int[]{10, 20, 30, 40, 50};
        int[] second = new int[]{10, 20, 30, 40, 50};
        for (int i = 0; i < 5; i++) {
            if (first[i] != second[i]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Array is equal");
        }
        else {
            System.out.println("Array is not equal");
        }
    }
        }



