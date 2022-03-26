package com.geeksforgeeks.String;

public class Exercise193 {
    public static void main(String[] args){
        String string="Geeks Gor Geeks";
        int index=6;
        char c='F';
        System.out.println("Original String : "+string);
        StringBuffer str = new StringBuffer(string);
        str.setCharAt(index,c);
        System.out.println("Modified String : "+str);

    }
}
