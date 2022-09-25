package ternary;

public class Practice1 {
    public static void main(String[] args) {
        int i= 5, j=10;
        System.out.println(i<j  ? "Hi": "Bye");
        System.out.println(i<j ? i+j : j-i);
        System.out.println(i<j ? "Got it ": i*j);
//===================================
        String result=i<j ?"Hi":"Bye";
        int result1=i<j?i+j:j-i;
        //i<j? "Got it" : i*j;  //you cannot store the result for this implementation since options  are having different data types

        System.out.println("Hi".equals(result));
        System.out.println(25>result1);





    }
}
