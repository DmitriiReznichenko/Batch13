package ifStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        /*get a number between 1 and 7 from user
        if the number is:
        1--> "it is monday"
        2-->" It is tuesday"
        ...
        7--> "It is sunday"
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println(" P" +
                "lease enter a number between 1 and 7");
        int number= scanner.nextInt();
        if (number==1){
            System.out.println("it is monday");
        }
        if (number==2){
            System.out.println("it is tuesday");
        }
        if (number==3){
            System.out.println("it is wednesday");
        }
        if (number==4){
            System.out.println("it is thursday");
        }
        if (number==5){
            System.out.println("it is friday");
        }
        if (number==6){
            System.out.println("it is saturday");
        }
        if (number==7){
            System.out.println("it is sunday");
        }

if (number<1 || number>7){
    System.out.println("There is not Day for that entry");
}




    }

}
