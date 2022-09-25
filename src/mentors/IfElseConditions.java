package mentors;

import java.util.Scanner;

public class IfElseConditions {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please, enter the 1st number");
        double firstNumber=scanner.nextDouble();
        System.out.println("Please, enter the 2nd number");
        double secondNumber=scanner.nextDouble();
        if (firstNumber>secondNumber) {
            System.out.println(firstNumber + "is bigger then " + secondNumber);
        } else if (firstNumber==secondNumber) {
            System.out.println("they are equal");

    }else {
            System.out.println(secondNumber + "is bigger then " + firstNumber);
        }
        }

    }

