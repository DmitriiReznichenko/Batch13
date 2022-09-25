package ifStatement;

import java.util.Scanner;

public class ElseIfTask2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter  your 1 test score");
        int score1=input.nextInt();
        System.out.println("enter  your 2 test score");
        int score2=input.nextInt();
        System.out.println("enter  your 3 test score");
        int score3=input.nextInt();
double average= (score1+score2+score3)/3;

        if (100<=average && average>=90){
            System.out.println("your latter grad is A");
        }else if (89<=average && average>=80){
            System.out.println("your latter grad is B");
               }else         if (79<=average && average>=70) {
            System.out.println("your latter grad is C");
        } else if(69<=average && average>=60) {
            System.out.println("your latter grad is D");
        } else {
            System.out.println("we have space for next semester");
        }









    }
}
