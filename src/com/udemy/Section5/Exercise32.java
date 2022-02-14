package com.udemy.Section5;

public class Exercise32 {
    public static void main(String[] args) {
        printDayOfTheWeek(2);
        printDayOfTheweek2(5);

    }
        public static void printDayOfTheWeek(int day){

            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day ");
                    break;
        }
        }
        public static void printDayOfTheweek2(int Day){
            if(Day==1){
            System.out.println("Monday");
            }
            else if(Day==2){
                System.out.println("Tuesday");
            }
            else if(Day==3){
            System.out.println("Wednesday");
            }
            else if(Day==4){
                System.out.println("Thursday");
            }
            else if(Day==5){
                System.out.println("Friday");
            }
            else if(Day==6){
                System.out.println("Saturday");
            }
            else if(Day==7){
                System.out.println("Sunday");
            }
            else {
                System.out.println("Invalid Day");
            }
            }


        }

