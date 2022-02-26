package com.geeksforgeeks.ClassesAndObjectPrograms;

public class Exercise158 {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setStudentAge(25);
        obj.setStudentName("Shruti Pathak");
        obj.setStudentRoll(9027);
        System.out.println("The Name of Student "+obj.getStudentName());
        System.out.println("The RollNo of Student "+obj.getStudentRoll());
        System.out.println("The Age of Student "+obj.getStudentAge());
    }
}

class Encapsulate {
    private String studentName;
    private int studentRoll;
    private int studentAge;

    public String getStudentName() {
        return studentName;
    }
    public int getStudentRoll() {
        return studentRoll;
    }
    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentName(String name) {
        this.studentName=name;
    }
    public void setStudentRoll(int roll) {
        this.studentRoll=roll;
    }
    public void setStudentAge(int age) {
        this.studentAge=age;
    }

}