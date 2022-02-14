package com.udemy.Section10;


    class Exercise126<T> {
        // An object of type T is declared
        T obj;
        Exercise126(T obj) { this.obj = obj; } // constructor
        public T getObject() { return this.obj; }
    }

    // Driver class to test above
    class Main {
        public static void main(String[] args)
        {
            // instance of Integer type
            Exercise126<Integer> iObj = new Exercise126<Integer>(15);
            System.out.println(iObj.getObject());

            // instance of String type
            Exercise126<String> sObj
                    = new Exercise126<String>("Shruti");
            System.out.println(sObj.getObject());
        }
    }


