package recapJavaWithAhmet;

import java.util.Scanner;

public class SwitchStatement {
    /* POSSIBLE INTERVIEW QUESTIONS:
   1-it is not likely to have directly Switch questions.
   2- "In what condition would you use Switch and IF /else If statement?"
   NOTE 1: Whenever you have limited conditions always go with SWITCH STATEMENT.
   NOTE 2: when you have 1 or 2 conditions/or limitless than go with IF Statement.

    */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input number");
        int option=scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("You are talking with Ahmet");
                break;
            case 2:
                System.out.println("You are talking with Adrian");
                break;
            case 3:
                System.out.println("You are talking with Mustafa");
                break;
            case 4:
                System.out.println("You are talking with Aizat");
                break;
            default:
                System.out.println("You have no one to talk");

        }
    }









}
