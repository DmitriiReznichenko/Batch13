package ifStatement;

import java.util.Scanner;

public class ElseIfTask {
    public static void main(String[] args) {
        Scanner integer=new Scanner(System.in);
        System.out.println("enter  an integer number");
        int number=integer.nextInt();
        if (number>0){
            System.out.println("your number is positive number");
        }else if (number<0){
            System.out.println("your number is negative number");
        }else {
            System.out.println("your number is Zero");
        }
    }
}
