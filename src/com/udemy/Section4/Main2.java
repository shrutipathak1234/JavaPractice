package com.udemy.Section4;

public class Main2 {
    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kiloBytes + "KB  " + kiloBytes / 1024 + "MB   " + kiloBytes % 1024 + "KB");
        }
    }
}
