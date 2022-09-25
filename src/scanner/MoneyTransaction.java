package scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double balance=200;
        System.out.println("Please, deposit your firsr check");
        double first=scanner.nextDouble();
        balance+=first;
        System.out.println("Please, deposit your second check");
        balance+= scanner.nextDouble();
        System.out.println("Please, deposit your third check");
        balance+= scanner.nextDouble();
        System.out.println("Please, enter your phone price $");
        balance-= scanner.nextDouble();
        System.out.println("Please, enter your head phone price $");
        balance-= scanner.nextDouble();
        System.out.println("your final balance is: "+balance);





    }
}
