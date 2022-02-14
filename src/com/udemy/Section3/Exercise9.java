package com.udemy.Section3;

public class Exercise9 {
    public static void main (String [] args){
        double firstDValue=20.00d;
        double secondDValue=80.00d;
        double sumDValue= ( firstDValue + secondDValue ) * 100.00d;
        System.out.println("sumDValue = " +sumDValue);
        double remainderDValue = sumDValue % 40.00d;
        System.out.println("remainderDValue = " +remainderDValue);
        boolean booleanResult = (remainderDValue==0) ? true : false;
        System.out.println("Is no reminder : " +booleanResult);

        if(booleanResult == false){

            System.out.println("Got some reminder");
        }

    }
}
