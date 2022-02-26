package com.geeksforgeeks.BasicPrograms;

public class Exercise132 {
        int r, i;

        public Exercise132(int r, int i) {
            this.r = r;
            this.i = i;
        }
        public void showC() {
            System.out.print(this.r + " +i" + this.i);
        }
        public static Exercise132 add(Exercise132 n1, Exercise132 n2) {

            Exercise132 res = new Exercise132(0, 0);

            res.r = n1.r + n2.r;

            res.i = n1.i + n2.i;

            return res;
        }

        public static void main(String arg[]) {

            Exercise132 c1 = new Exercise132(4, 5);
            Exercise132 c2 = new Exercise132(10, 5);
            System.out.print("first Complex number: ");
            c1.showC();
            System.out.print("\nSecond Complex number: ");
            c2.showC();
            Exercise132 res = add(c1, c2);
            System.out.println("\nAddition is :");
            res.showC();
        }
    }

