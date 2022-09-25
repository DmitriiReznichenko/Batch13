package loops;

import java.util.Scanner;

public class WhileLoop6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scanner.nextLine();
        int index=word.length()-1;
        while (index>=0){
            System.out.print(word.charAt(index)+ ",");
            index-- ;
        }





    }
}
