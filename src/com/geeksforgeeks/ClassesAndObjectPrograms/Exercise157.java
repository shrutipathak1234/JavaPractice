package com.geeksforgeeks.ClassesAndObjectPrograms;

public class Exercise157 implements Test {
    public static void main(String args[]) {
        Exercise157 obj = new Exercise157();
        obj.show();

    }

    @Override
    public void show() {
        System.out.println("This is Interface Example");

    }

}

interface Test {
    void show();
}
