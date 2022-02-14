package com.udemy.Section6;


    public class Exercise72 {
        private double radius;

        public Exercise72(double radius) {
            if (radius < 0) {
                this.radius = 0;
            } else {
                this.radius = radius;
            }
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
    }


    // write your code here


