package homework7;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithA {
    public static void main(String[] args) {

        System.out.println("Enter a string value");
        Scanner s = new Scanner(System.in);

        String str = s.next();
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            str1[i]='a';
            System.out.println(str1);
        }
    }
}

