package object;
import java.util.Arrays;
public class TaskLettersArray {
    /**
     * Create a task class under object package
     * create a method that will return an array for every letter of given String
     * parameter of the method will be string
     *
     * Ex: "Phone" --> output --> [P, h, o, n, e]
     */
    public static char[] letterOfString(String text){
        char[] letters = new char[text.length()];
        for ( int index = 0; index< text.length(); index++){
            letters[index]  =  text.charAt(index);
        }
        return letters;
    }
    public static void main(String[] args) {
        char[] array1 = letterOfString("Case");
        System.out.println(  Arrays.toString(array1)  );
        System.out.println();
        System.out.println(Arrays.toString( letterOfString("Phone")  ));
        String[] items={"phone","case","earphone"};
       int count= letterOfString(items);
        System.out.println(count);
    }
    public static int letterOfString(String[] items){


        return items.length;
    }
}
