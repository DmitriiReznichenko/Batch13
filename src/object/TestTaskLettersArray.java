package object;

import java.util.Arrays;

public class TestTaskLettersArray {
    public static void main(String[] args) {
        char[] array1 = TaskLettersArray.letterOfString("Case");
        System.out.println(  Arrays.toString(array1)  );
        System.out.println();
        System.out.println(Arrays.toString( TaskLettersArray.letterOfString("Phone")  ));
        String[] items={"phone","case","earphone"};
        int count= TaskLettersArray.letterOfString(items);
        System.out.println(count);
    }
}
