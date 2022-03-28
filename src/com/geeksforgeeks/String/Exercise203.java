package com.geeksforgeeks.String;
//WAP to reverse a string.
//Input : This is an example
//Output : elpmaxe na si sihT
public class Exercise203 {
    public static void main(String [] args){

        String s1 = "This is an example ",s2="";
        System.out.print("Original String : "+s1);
        System.out.print(" || Reversed String : ");
        for(int i = s1.length()-1 ; i >= 0  ; i--){
          s2=s2+s1;

            System.out.print(s2.charAt(i));
        }

    }
}
