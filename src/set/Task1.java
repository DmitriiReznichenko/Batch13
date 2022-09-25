package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        String[] array1={"a","b","c","d","a","c","k","c"};
        LinkedHashSet<String> set1=new LinkedHashSet<>();
        for (int i = 0; i<array1.length; i++){
            set1.add(array1[i]);
        }
        System.out.println(set1);







    }
}
