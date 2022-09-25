package mentors;

import java.util.Scanner;

public class Batch13Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to B13 Store");
        while (true) {
            System.out.println("Would you like to buy something? y/n");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("available products: MacBookPro, MacBookAir, Iphone14");
                System.out.println("which product you would like to buy?");
                String productName = scanner.next();
                if (productName.equalsIgnoreCase("MacBookPro")) {
                    System.out.println("price of the MacBookPro - $299");
                } else if (productName.equalsIgnoreCase("MacBookAir")) {
                    System.out.println("price of the MacBookAir - $199");
                } else if (productName.equalsIgnoreCase("Iphone14")) {
                    System.out.println("price of the Iphone14 - $99");
                } else {
                    System.out.println("Sorry, we don't have this product");
                }


            }
            System.out.println("thank you for choosing us");
            break;
        }

    }
}


