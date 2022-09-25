package groupProject0613;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter min number(integer)");
        int min=scanner.nextInt();
        System.out.println("Please enter max number(integer)");
        int max=scanner.nextInt();
        int sum =0;
        for(int i=min; i<=max; i++)
            if (i%2==0 && i%7==0){
                sum+=i;
                System.out.print(i+"+");
            }
        System.out.print("="+sum);


    }
}
