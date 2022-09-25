package loops;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        int one=1;
        while (one<=number){
            if (number%one==0){
                System.out.println( one + "devisor of "+number);
            }
            one++;
        }
    }
}
