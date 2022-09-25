package loops;

import java.util.Scanner;

public class ForLoopTask3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a Positive integer number");
        int number=scanner.nextInt();
        int sum=0;
        for (int i=1; i<number; i++){
            if (number%i==0) {
                sum += i;
                System.out.println(i);
            }
        }
        if (sum==number) System.out.println(number +" is  a perfect number");
        else System.out.println(number +" is not a perfect number");

    }
}
