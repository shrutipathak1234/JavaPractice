package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Create Singleton Class
public class Exercise156 {
    public static void main(String[] args){
        SingletonExample ss = SingletonExample.getInstance();
        SingletonExample ss2 = SingletonExample.getInstance();
        SingletonExample ss3 = SingletonExample.getInstance();
        System.out.println(ss+" "+ss2+" "+ss3);
    }
}
class SingletonExample{
    private static SingletonExample obj;
    private SingletonExample(){
        System.out.println("This is Singleton Example");
    }
    public static SingletonExample getInstance() {
        if (obj == null) {
            obj = new SingletonExample();
        }
        return obj;
    }
}