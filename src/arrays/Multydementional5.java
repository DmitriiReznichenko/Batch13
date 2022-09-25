package arrays;

import java.util.Arrays;

public class Multydementional5 {
    public static void main(String[] args) {
char[][] symbols={{'L','%','7'},{},{},{'w','4'}};
        System.out.println(symbols.length);//4
        System.out.println(symbols[0].length);//3
        System.out.println(Arrays.toString(symbols[0]));
        String[][][] example = {  {  {"e", "2.5" }, {"Hi"}  }, { {"Bye"}, {"Hello","There"}   }, {   {"Last", "Array"}   }    };
        System.out.println(Arrays.deepToString(example));
        String name="three dimension example";
        System.out.println(example[0][1][0]+" "+name);
        for (String[][] a1: example) {
            for (String[] a2:a1) {
                for (String a3:a2) {
                    if (a3.equalsIgnoreCase("hi")) {
                        System.out.println(a3 + " " + name);
                    }

                }

            }
        }











    }
}
