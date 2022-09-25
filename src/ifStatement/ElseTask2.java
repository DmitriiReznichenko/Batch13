package ifStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How much is your purchase $?");
        double cost = input.nextDouble();
        if (cost >=100) {
            System.out.println("you  have 20% discount. Your payment will be $" + cost * 0.8);
        }else {
            System.out.println("you  have 5% discount. Your payment will be $" + cost * 0.95 );
        }



    }
}
