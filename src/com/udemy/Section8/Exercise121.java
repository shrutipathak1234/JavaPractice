package com.udemy.Section8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Collections;

public class Exercise121 {
    public static void main(String [] args){
        ArrayList<Integer> list  = new ArrayList<Integer>();
        //Add Elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // get Elements
        int Element= list.get(2);

        System.out.println(Element);
        // TO add element in between
        list.add(1,24);
        System.out.println(list);

        // Set Element

        list.set(0,5);
        System.out.println(list);

        // Delete Element

        list.remove(0);
        System.out.println(list);

        // Get Size
       int size=list.size();
        System.out.println(size);

        // To iterate

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //Sorting
        Collections.sort(list);
        System.out.print(list);
    }
}
