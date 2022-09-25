package string;

import java.util.Locale;

public class Methods3 {
    public static void main(String[] args) {
        String text= "Do whatever it takes to be successful";

        //toLowerCase();  toUpperCase();
        text=text.toLowerCase();
        System.out.println(text);
        text=text.toUpperCase();
        System.out.println(text);
        System.out.println(text.toLowerCase());

        // startsWith(), endWith(); return true/false
       boolean r1= text.startsWith("d");
        System.out.println(r1);
        boolean r2= text.startsWith("DO");
        System.out.println(r2);
        boolean r3= text.startsWith("TAKES");
        System.out.println(r3);
        boolean r4=text.endsWith("Ul");
        System.out.println(r4);

        System.out.println(text.endsWith("DO WHATEVER IT TAKES TO BE SUCCESSFUL"));

        System.out.println("___________________________");
        String a="flower", b= "Laptop";



        System.out.println(a.equalsIgnoreCase(b));
        System.out.println("________");

        String str1="Red";
        String str2="RED";
        boolean areSame1=(str1.equals("red"));
        System.out.println(areSame1);
        System.out.println(str1.equals("ed"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str2.toLowerCase()));
        System.out.println(str1.toUpperCase()==str2);
        System.out.println(str1.toUpperCase().equals( str2));

        System.out.println(str1.equalsIgnoreCase("Red"));

                                   //replace                                                                    m
        String language="Java";
        String newLanguage= language.replace('v', 'x');

        System.out.println(newLanguage);
        System.out.println(language);
        System.out.println(language.replace('a','$'));

        language=language.replace("va", "da");
        System.out.println(language);
        System.out.println(language.replace("da","YES"));
        System.out.println(language.replace("Jada","English"));
        System.out.println(language.replace("d", "I like this replacement method***"));
        language= language.replace('d','v');
        System.out.println(language);

    }
}
