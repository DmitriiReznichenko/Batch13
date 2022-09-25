package loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any String: ");
        String input=sc.next();
        String reverse="";


        for(int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
            //System.out.println(reverse);
        }
        if(reverse.equalsIgnoreCase(input)){
            System.out.println(reverse+" this is polindrome string");
        }else{
            System.out.println("This is not polindrome string");
        }
    }
}