package loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        String answer;


        do {int number= random.nextInt(2);
            System.out.println("Game is started, Make a guess! HEAD/TAIL");
            String userGuess= scanner.nextLine();

            String flip=number ==0? "Head" : "Tail";

            if (userGuess.equalsIgnoreCase(flip)) {
                System.out.println("You are lucky, it is your day today");
            }else {
                System.out.println("Sorry, that was not the correct choice");
            }
            System.out.println("Do you want to play again?");
            answer=scanner.nextLine();

        }while ( answer.equalsIgnoreCase("yes"));
        System.out.println("It is Ok! See you next time!");




    }
}
