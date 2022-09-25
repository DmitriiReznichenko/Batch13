package stringBuilder;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("Good Morning");

        builder.insert(0,"Hi ");

        System.out.println(builder);

        builder.insert(builder.indexOf(" ")," Julia,");
        System.out.println(builder);
        String[] array={" How ", "is", "everything?"};
        builder.insert(builder.indexOf("G"), Arrays.toString(array));
        System.out.println(builder);
        builder.insert(2,true);
        System.out.println(builder);

        System.out.println(builder.charAt(5));
        builder.delete(2,6);
        System.out.println(builder);

        System.out.println(builder.delete(builder.indexOf("["),builder.indexOf("]")+1 ));

        builder.deleteCharAt(8);
        System.out.println(builder);

        builder.delete(14,1000);
        System.out.println(builder);
       // builder.deleteCharAt(16);

        builder.replace(5,7,"**");
        System.out.println(builder);

        builder.replace(builder.indexOf("o"),builder.indexOf("d"),"$$");
        System.out.println(builder);

builder.reverse();
        System.out.println(builder);

String str="java";
StringBuilder builder1=new StringBuilder(str);
String str2=builder1.reverse().toString();
        System.out.println(builder1);
        System.out.println(str2);
    }
}
