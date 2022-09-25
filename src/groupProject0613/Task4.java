package groupProject0613;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the integer positive number between 1 and 10");
        int number=scanner.nextInt();
        for (int line=1;line<=number;line++){
            for (int raw=1;raw<=line;raw++){
                System.out.print(line+"");
            }
            System.out.println();
        }
    }
}
