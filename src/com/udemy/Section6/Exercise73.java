package com.udemy.Section6;


    public class Exercise73 extends Exercise72 {
        private double height;

        public Exercise73(double radius, double height) {
            super(radius);
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }
        public double getHeight() {
            return height;
        }
        public double getVolume() {
            return getArea()*height;
        }
    }

