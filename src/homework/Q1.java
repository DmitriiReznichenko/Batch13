package homework;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter  a String with tree words in it");
        String s=scanner.nextLine();
        int indexForFirstSpace=s.trim().indexOf(" ");
        String firstWord=s.trim().substring(0, indexForFirstSpace);
        System.out.println(firstWord);

        String lastTwoWord=s.trim().substring(indexForFirstSpace+1);
        //System.out.println(lastTwoWord);
        int indexOfSecondSpace=lastTwoWord.indexOf(" ");

        String secondWord= lastTwoWord.substring(0,indexOfSecondSpace);
        System.out.println(secondWord);
        String lastWord=lastTwoWord.substring(indexOfSecondSpace+1);
        System.out.println(lastWord);

    }
}
