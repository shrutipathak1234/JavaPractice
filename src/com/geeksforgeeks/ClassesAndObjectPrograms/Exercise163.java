package com.geeksforgeeks.ClassesAndObjectPrograms;
//Java Program to Show Overriding of Methods in Classes
    class Base {

        void show()
        {
            System.out.println("Parent's show()");
        }
    }

    class Child extends Base {

        @Override
        void show()
        {
            System.out.println("Child's show()");
        }
    }

   class Exercise163 {
        public static void main(String[] args)
        {

            Base obj1 = new Base();
            obj1.show();

            Base obj2 = new Child();
            obj2.show();
        }
    }
