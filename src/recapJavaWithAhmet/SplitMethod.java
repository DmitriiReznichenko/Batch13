package recapJavaWithAhmet;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String  str="Hello java is so cool";
        String [] array=str.split(" ");
        System.out.println(Arrays.toString(array));
        for (String word:array){
            String reverse="";
            for (int i=word.length()-1;i>=0;i--){
                reverse+=word.charAt(i);

            }
            System.out.println(reverse);
        }









    }
}
