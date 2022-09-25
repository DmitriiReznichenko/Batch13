package mentors;

import java.util.Scanner;

public class TwoBalls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is a color of your first ball?");
        String firstBall=scanner.nextLine();
        System.out.println("what is a color of your second ball?");
        String secondBall=scanner.nextLine();
        boolean win= false;
        if (firstBall.trim().equalsIgnoreCase("green")||secondBall.trim().equalsIgnoreCase("green")){
            win=true;

        }else if (firstBall.trim().equalsIgnoreCase("blue") && secondBall.trim().equalsIgnoreCase("blue")){
            win=true;
        }else win=false;
        if (win) System.out.println("You are win!");
        else System.out.println("You are lose");
        System.out.println("Thank you for your plaing");
    }
}
