package loops;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter positive number");
        int first=scanner.nextInt();
        System.out.println("enter  second positive number");
        int second=scanner.nextInt();

        while (first<=second){
            System.out.println(first);
            first++;
        }

    }
}
