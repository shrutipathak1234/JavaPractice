package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Show Use of Super Keyword in Class
        class Z {
            int maxSpeed = 45;
        }

    class X extends Z
    {
        int maxSpeed =60 ;

        void display()
        {
            System.out.println("Maximum Speed: " + super.maxSpeed);
        }
    }

    class Exercise164
    {
        public static void main(String[] args)
        {
            X small = new X();
            small.display();
        }
    }


