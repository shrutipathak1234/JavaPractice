package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Show Polymorphism in Class
    class Polymorphism {

        static int Multiply(int a, int b)
        {
            return a * b;
        }

        static double Multiply(double a, double b)
        {
            return a * b;
        }
    }

    class Exercise161 {

        public static void main(String[] args)
        {
            System.out.println(Polymorphism.Multiply(5, 7));
            System.out.println(Polymorphism.Multiply(10.5, 12.3));
        }
    }


