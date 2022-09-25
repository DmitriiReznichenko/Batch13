package exceptions;

public class Practice1 {
    public static void main(String[] args) {
        String str="Last day";
     //   System.out.println(str.charAt(20));
        String str1="13B";
        try {
            System.out.println(str1.charAt(15));
            System.out.println(Integer.parseInt(str1));


        }catch (NumberFormatException exception){
            System.out.println("this is catch block for NumberFormatException");
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("Catching string index out exception");
        }
        try {
            Integer.parseInt(str1);


        }catch (NumberFormatException exception){
            System.out.println("this is catch block for NumberFormatException");

        }



        System.out.println("HELLO WORLD2");










    }
}
