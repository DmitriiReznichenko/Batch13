package homework7;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int temp=number;
        int digit3=number%10; number=number/10;
        int digit2=number%10; number=number/10;
        int digit1= number%10;

        // Find out if the number above is an Armstrong number.
        //1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
    }
}
