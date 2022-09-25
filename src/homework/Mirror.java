package homework;

import java.util.Scanner;

public class Mirror {


    public static void main(String[] args) {
        System.out.println("Enter a string value");

        String str = new Scanner(System.in).next();
        int i=0;
        String mirror="";
         while (str.charAt(i)==str.charAt(str.length()-1-i)){
             if ( i<=str.length()-1-i){
                mirror += str.charAt(i);
               }
            i++;
        }
        System.out.println(mirror);
    }
}
