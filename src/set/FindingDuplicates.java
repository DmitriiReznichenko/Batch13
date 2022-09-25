package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        String[] array1={"a","b","c","d","a","c","k","c"};
        System.out.println(Arrays.toString(array1));
        List<String> list= Arrays.asList(array1);
        System.out.println(list);
        HashSet<String> set=new HashSet<>(list);
        System.out.println(set);

        HashSet<String> set2=new HashSet<>();
        for (String word:array1){
            set2.add(word);
        }
        System.out.println(set2);


        for(int i=0;  i< array1.length; i++){
            for(int k = i+1; k< array1.length; k++){
                if( array1[i] == array1[k]){
                    System.out.println(array1[k]);
                }
            }
        }

        HashSet<String> set3=new HashSet<>();
        for (String word:array1){
            if (!set3.add(word)){
                System.out.println("duplicate - "+word);
            }
        }
        System.out.println(set3);



    }
}
