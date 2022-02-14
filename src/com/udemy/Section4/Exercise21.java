package com.udemy.Section4;
//MegaByteConverter
//Coding Exercises
public class Exercise21 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabytes = (kiloBytes/1024);
            int kiloRemainder = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
        }

    }
}



