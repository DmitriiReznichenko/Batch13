package groupProject0613;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a sentence that is not separated");
        System.out.println("by space and each word starts with upper case");
        String text=scanner.nextLine();
        String newText="";
        for (int i=0;i<=text.length()-1; i++){
            char ch=text.charAt(i);
            if (ch>=65 && ch<=90){
                newText+=" "+ch;
            }else newText+=ch;
        }
        System.out.println(newText);
    }
}
