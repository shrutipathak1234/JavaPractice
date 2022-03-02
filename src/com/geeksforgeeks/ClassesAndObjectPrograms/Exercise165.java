package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Show Use of This Keyword in Class
    public class Exercise165 {
        int first;
        int second;


        Exercise165(int first, int second)
        {
            this.first = first;
            this.second = second;
        }

        void showcase()
        {

            System.out.println("first = " + first + " second = " + second);
        }

        public static void main(String[] args)
        {
            Exercise165 object = new Exercise165(9, 8);
            object.showcase();
        }
    }


