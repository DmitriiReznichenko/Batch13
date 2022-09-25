package string;

import java.util.Scanner;

public class MethodTask2 {
    public static void main(String[] args) {
         /*
        Get information  of user in the following format : M - David White - 1999
        -check if the input string is starting with F
         -check if the input string is ending with M
          -check if the input string equals to your name
          -check if the input string is ending with year 2000
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter information in following format: M - David White - 1999");
        String informatione= scanner.nextLine();
        boolean r1= informatione.startsWith("F");
        System.out.println("the input string is starting with F: "+r1);
        boolean r2= informatione.endsWith("M");
        System.out.println("the input string ending with M: "+r2);
        String name="Dmitrii";
        boolean areSame1=(informatione.equals(name));
        System.out.println("the input string equals to your name: "+areSame1);
        boolean r3= informatione.endsWith("2000");
        System.out.println("the input string ending with year 2000: "+r3);

        System.out.println(informatione);
       String part= informatione.substring(informatione.length()-4);
        System.out.println( informatione.replace(part, "****'s")  );


    }
}