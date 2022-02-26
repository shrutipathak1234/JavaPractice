package com.geeksforgeeks.ClassesAndObjectPrograms;
///Java Program to Show Abstraction in Class

abstract class Aas {
    String a;
    abstract double area();
    public abstract String toString();

    public Aas(String a){
        System.out.println("Aas constructor called");
        this.a=a;
    }
    public String getColor() {
        return a;
    }
}
    class Bbs extends Aas{
        double r;
        public Bbs(String a, double r){
            super(a);
            this.r=r;
        }
         @Override double area(){
             return Math.PI * Math.pow(r, 2);
         }
         @Override public  String toString(){
             return ("Aas a is "+super.getColor() + " and area is : " + area());
         }

    }
    class Ccs extends Aas {

        double l;
        double w;
        public Ccs(String a, double l, double w)
        {
            super(a);
            this.l = l;
            this.w = w;
        }
        @Override double area() {
            return l * w;
        }

        @Override public String toString()
        {
            return "Ccs a is " + super.getColor()
                    + " and area is : " + area();
        }
    }

public class Exercise160 {
    public static void main(String[] args)
    {
        Aas s1 = new Bbs("Red", 4.2);
        Aas s2 = new Ccs("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
