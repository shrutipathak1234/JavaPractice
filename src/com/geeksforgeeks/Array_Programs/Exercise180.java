package com.geeksforgeeks.Array_Programs;

public class Exercise180 {

        private int arr[] = {10, 324, 45, 90, 9808};

        private int largest()
        {
            int i;
            int maxelement = arr[0];

            for (i = 1; i < arr.length; i++)
                if (arr[i] > maxelement)
                    maxelement = arr[i];

            return maxelement;
        }

        public static void main(String[] args)
        {

            System.out.println("Largest in given array is " + new Exercise180().largest());
        }
    }

