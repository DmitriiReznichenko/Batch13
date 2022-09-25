package loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter  positive integer number");
        int first=scanner.nextInt();
        System.out.println("Please enter   one more positive integer number which is bigger then the first one");
        int second=scanner.nextInt();
        int sum= 0;
        do {
            sum+=first;
            System.out.println("The sum of number between "+first+" and "+second +" is "+sum);

            first++;
        }while (first<=second);
        System.out.println(sum);




    }
}
