package recapJavaWithAhmet;

import java.util.Arrays;

public class StringAndMethods {
    public static void main(String[] args) {
        String str="ahmet loves java";
        String str1=new String("ahmet loves java");
        String str2="ahmet loves java";
        String str3=new String("ahmet loves java");
        System.out.println(str.equals(str1));//true
        System.out.println(str==str1);//false
        System.out.println(str==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true

        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(str.charAt(0));
        str.substring(0,1).toUpperCase();
    }





}
