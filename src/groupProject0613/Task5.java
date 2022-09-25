package groupProject0613;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the integer positive number between 1 and 10");
        int number=scanner.nextInt();
        for (int line=number;line>0;line--){
            for (int raw=line;raw>0;raw--){
                System.out.print(line+"");
            }
            System.out.println();
        }
    }
}
