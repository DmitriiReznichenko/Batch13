package mentors;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence= scanner.nextLine();
        int lenght=sentence.length();
        System.out.println(lenght);
        char character= sentence.charAt(0);
        System.out.println(character);
        System.out.println(sentence.startsWith("s"));
        System.out.println(sentence.startsWith("t"));
        System.out.println(sentence.startsWith("k"));
        System.out.println(sentence.startsWith("to"));
        System.out.println(sentence.endsWith("k"));
        System.out.println(sentence.endsWith("y"));
        System.out.println(sentence.endsWith("ay" ));
        System.out.println(sentence.indexOf("s"));
        System.out.println(sentence.toUpperCase());



    }
}
