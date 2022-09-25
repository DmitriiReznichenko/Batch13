package loops;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter  positive integer number");
        int number=scanner.nextInt();

        String star="1";

        do {
            System.out.println(star  );
            star +="1";
            number--;
        }while (number>0);

    }
}
