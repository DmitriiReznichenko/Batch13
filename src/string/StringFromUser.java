package string;

import java.util.Scanner;

public class StringFromUser {
    public static void main(String[] args) {

        Scanner inputUser= new Scanner(System.in);
        System.out.println("Please, enter a text");
        String text= inputUser.nextLine();
        char first= text.charAt(0);
        System.out.println("first: "+first);
        System.out.println("last: "+text.charAt(text.length()-1));
        System.out.println("lenght : "+ text.length());
        System.out.println("midle charachter: "+ text.indexOf(text.charAt(text.length()/2)));
        System.out.println("second 't': "+text.indexOf('t', text.indexOf('t')+1));

    }
}
