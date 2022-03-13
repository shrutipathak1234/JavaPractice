package com.geeksforgeeks.javaMethodsPrograms;


    class ABC{

        public void disp()
        {
            System.out.println("disp() method of parent class");
        }
    }
    class Exercise178 extends ABC{

        public void disp(){
            System.out.println("disp() method of Child class");
        }
        public void newMethod(){
            System.out.println("new method of child class");
        }
        public static void main( String args[]) {

            ABC obj = new ABC();
            obj.disp();
            ABC obj2 = new Exercise178();
            obj2.disp();
        }
    }

