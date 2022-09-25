package mentors;

import java.util.Scanner;

public class ConvertationMinutes {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int minutes=input.nextInt();
        int years=minutes/525_949, days= minutes%525_949/1440;
        System.out.println(minutes +" minutes is equals "+ years + " years and "+days+" days.");







    }






}
