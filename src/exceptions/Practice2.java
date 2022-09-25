package exceptions;

public class Practice2 {
    public static void main(String[] args) {
        String str="13B";
        try {
            System.out.println(str.charAt(21));
            Integer.parseInt(str);
        }catch (RuntimeException runtimeException){
            System.out.println("Single catch with parent type of exception");
            //- one try block can have single catch block or multiple catch blocks
            // you can use parent (super) type of exception to cover multiple exceptions in the same family
            //- you can have multiple try catch blocks in the same class
            //
        }













    }
}
