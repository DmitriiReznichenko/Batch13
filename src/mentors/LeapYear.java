package mentors;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an year");
        int year=scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year +" is the century leap year");
                }else {
                    System.out.println(year+ " is century year, but it is not a leap ");}

            }else {System.out.println(year + " is the leap year");}

        }else {
            System.out.println(year+ " is not a leap year");}
    }
}
