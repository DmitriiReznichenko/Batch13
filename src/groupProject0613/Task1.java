package groupProject0613;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter some text");
        String text=scanner.nextLine();
        text=text.trim();

        for (int i=text.length()-1; i>=0; i--)
        {
            System.out.print(text.charAt(i));

        }
    }
}
