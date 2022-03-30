package com.geeksforgeeks.String;

//WAP to check whether a string contains a specified word.
//String : Today it is sunny and raining.
//Word to check : and
public class Exercise206 {
    public static void main(String[] args) {
        Boolean flag = false;
        String s1 = "Today it is sunny and raining.";
        String s2 = "and";
        String s3 = "";
        for (int i = 0; i <= s1.length() - 1; i++) {
            if (s1.charAt(i) != ' ') {
                s3 = s3+s1.charAt(i);
            }

            else {
                if (s3.equals(s2)) {
                flag=true;
                System.out.println(flag+" Matched");
                }
                else {
                   s3="";
                }
            }
        }
        if(flag==false){
            System.out.println("Not Matched "+flag);

        }
    }
}