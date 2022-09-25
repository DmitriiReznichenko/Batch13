package homework;

import java.util.Scanner;

public class Mirror2 {


    public static void main(String[] args) {
        System.out.println("Enter a string value");

        String str = new Scanner(System.in).next();

        String mirror="";
        for (int index=0;index<=str.length()-1-index;index++) {
            if (str.charAt(index) == str.charAt(str.length() - 1 - index)) {
                mirror += str.charAt(index);
            }

        }System.out.println(mirror);
    }
}
