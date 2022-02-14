package com.udemy.Section9;

public class Main9 {


        public static void main(String[] args) {
            Exercise124 mcLaren = new Exercise124(6);
            Exercise124.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
//        Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
            System.out.println(first.driveSpeed(1000));

        }
}
