package string;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String day="Saturday";
        System.out.println(day.split("a"));
        System.out.println(Arrays.toString(day.split("a")));
        String[] strArray=day.split("a");
        System.out.println(Arrays.toString(strArray));
        System.out.println(day.toUpperCase());
        for (String str:strArray) {
            System.out.println(str);
        }
String apple="apple is red";
        String[] appleParts=apple.split("a");
        System.out.println(Arrays.toString(appleParts));
        for (String part:appleParts             ) {
            System.out.println(part.toUpperCase());
        }









    }
}
