package com.geeksforgeeks.javaMethodsPrograms;

public class Exercise177 {


        String name;
        public void eat() {
            System.out.println("I can eat");
        }
    }


    class Dog extends Exercise177 {

        public void display() {
            System.out.println("My name is " + name);
        }
    }

    class Main {
        public static void main(String[] args) {


            Dog labrador = new Dog();


            labrador.name = "Rohu";
            labrador.display();


            labrador.eat();

        }
    }

