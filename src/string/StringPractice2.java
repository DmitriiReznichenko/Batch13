package string;

import java.util.Arrays;

public class StringPractice2 {
    public static void main(String[] args) {
        String str="I want to solve this quastion in two minutes";
        String[] parts=str.split(" ");
        for (String part:parts             ) {


            System.out.println(part);
        }
    }
}
