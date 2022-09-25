package ifStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.println("Do you Have Driver License?");
        String dL= q.nextLine();
        if (dL.equalsIgnoreCase("yes")){
            System.out.println("You are great!");
        } else {
            System.out.println("Please visit closest DMV");
        }




    }
}
