package com.SelfPractice.Section11;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

// WAP to print the sum of squares of first 5 natural numbers.
//1² + 2² + 3² + 4² + 5²
public class Exercise91 {
    public static void main(String[] args){
        sqSum();

    }
    public static void sqSum(){
      double sum=0.0;
      double number=5.0;

      for (int i=1;i<=number;i++){
          sum= sum + power(i,2.0);

      }
    System.out.println("Sum = "+sum);

    }
}
