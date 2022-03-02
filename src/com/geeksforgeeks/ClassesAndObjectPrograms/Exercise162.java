package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Show Overloading of Methods in Class
public class Exercise162 {

        public int sum(int x, int y)
        {
            return (x + y);
        }

        public int sum(int x, int y, int z)
        {
            return (x + y + z);
        }

        public double sum(double x, double y)
        {
            return (x + y);
        }

        public static void main(String args[])
        {
            Exercise162 s = new Exercise162();
            System.out.println(s.sum(100, 200));
            System.out.println(s.sum(100, 200, 300));
            System.out.println(s.sum(100.5, 200.5));
        }
    }


