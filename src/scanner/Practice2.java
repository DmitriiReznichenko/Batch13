package scanner;

import java.util.Scanner;

public class Practice2 {

        public static void main(String[] args) {
        /*
        calculate BMI
        bmi=weight/height

         */
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your weight in kg");
            double weight = input.nextDouble();
            System.out.println("Please enter your height in meters" );
            double height = input.nextDouble();
            double BMI = weight / (height * height);
            System.out.println("Your BMI is: "+BMI);
        }
    }
