package switchStatement;

import java.util.Scanner;

public class Prictice2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter  a number between 1 and 5");
        int number=input.nextInt();
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fridday");
                break;
            default:
                System.out.println("weekend");
                break;

        }
    }
}
