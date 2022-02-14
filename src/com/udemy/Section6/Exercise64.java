package com.udemy.Section6;

public class Exercise64 {


        private int x;
        private int y;

        public Exercise64() {
        }

        public Exercise64(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance() {
            return distance(0, 0);
        }

        public double distance(int x, int y) {
            return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        }

        public double distance(Exercise64 another) {
            return distance(another.x, another.y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }





