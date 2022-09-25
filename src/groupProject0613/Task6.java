package groupProject0613;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter text");
        String text=scanner.nextLine();
        String newText = "";
        for (int i = 0; i < text.length()-1; i++){
            char ch = text.charAt(i);
            if (newText.indexOf(ch) ==-1 || ch==' '){
                newText = newText + ch;
            }else {
                continue;
            }
        }
        System.out.println(newText + " ");
    }
    }

