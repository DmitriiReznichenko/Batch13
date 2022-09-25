package mentors;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter  number");
        double firstNumber=scanner.nextDouble();
        System.out.println("enter one more number");
        double secondNumber=scanner.nextDouble();
        System.out.println("Enter one more number");
        double thirdNumber=scanner.nextDouble();
        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("Your largest number is: "+firstNumber);
        }else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Your largest number is: "+ secondNumber);
        }else if (thirdNumber>firstNumber && thirdNumber>secondNumber){
            System.out.println("Your largest number is: "+thirdNumber);
        }else {
            System.out.println("Your numbers are equal");
        }

    }
}
