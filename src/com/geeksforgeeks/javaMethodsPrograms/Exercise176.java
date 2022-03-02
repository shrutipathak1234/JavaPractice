package com.geeksforgeeks.javaMethodsPrograms;
//WAP to show hasNext() and next().

import java.util.*;
public class Exercise176 {

        public static void main(String[] args)
        {

            ArrayList<String> list = new ArrayList<String>();

            list.add("Shruti");
            list.add("Pathak");

            Iterator<String> iterator = list.iterator();

            System.out.println(iterator.hasNext());

            iterator.next();

            System.out.println(iterator.hasNext());

            iterator.next();

            System.out.println(iterator.hasNext());
        }
    }


