package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Show Inheritance in Class
        class Aa{

        public int gear;
        public int speed;

    Aa(int gear, int speed)
        {
            this.gear = gear;
            this.speed = speed;
        }

        public void applyBrake(int decrement)
        {
            speed -= decrement;
        }

        public void speedUp(int increment)
        {
            speed += increment;
        }

        public String toString()
        {
            return ("No of gears are " + gear + "\n"
                    + "speed of bicycle is " + speed);
        }
    }


    class child extends Aa {


        public int seatHeight;

        public child(int gear, int speed,
                            int startHeight)
        {

            super(gear, speed);
            seatHeight = startHeight;
        }

        public void setHeight(int newValue)
        {
            seatHeight = newValue;
        }
        @Override public String toString()
        {
            return (super.toString() + "\nseat height is " + seatHeight);
        }
    }


    public class Exercise159 {
        public static void main(String args[])
        {

            child mb = new child(5, 200, 205);
            System.out.println(mb.toString());
        }
    }



