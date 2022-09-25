package switchStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("what is your favorite fruit?( strawberry, apple, kiwi, dragon friut, banana,pineapple, mango");
        String fruit=input.nextLine().toLowerCase().trim();
        switch (fruit){
            case "strawberry" :
                System.out.println("we have " + fruit + " in the store");
                break;
            case "apple" :
                System.out.println("we have " + fruit + " in the store");
                break;
            case "kiwi" :
                System.out.println("we have " + fruit + " in the store");
                break;
            case "dragon friut" :
                System.out.println("we have " + fruit + " in the store");
                break;
            case "banana" :
                System.out.println("we have " + fruit + " in the store");
                break;
            case "pineapple" :
                System.out.println("we have " + fruit + " in the store");
                break;
            case "mango" :
                System.out.println("we have " + fruit + " in the store");
                break;
            default:
                System.out.println("we don't have " + fruit + " in the store");
                break;
        }
    }
}
