package mentors;

import java.util.Scanner;

public class NegativeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number=scanner.nextInt();
        int max=number;
        int min=number;
        if (number>=0){
            while (true){
                System.out.println("Please enter an integer number");
                number=scanner.nextInt();
                if (number<=0){
                    break;
                }
                if (number>max){
                    max=number;

                }
                if (number<min){
                    min=number;
                }

            }
            System.out.println(max + " is maximum of these numbers");
            System.out.println(min + " is minimum of these numbers");

        }else System.out.println(number+" is not valid");

    }
}
