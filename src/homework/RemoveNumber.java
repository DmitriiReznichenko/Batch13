package homework;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {

        // Create the array on lines above
        int[] numbers={10,4,3,55,32,145,443,234,98,32};
        Scanner scanner=new Scanner(System.in);
        //User is asked for a number below. Please get the number using scanner.
        System.out.println("Please enter number from array");
        int input=scanner.nextInt();
        boolean arrayContainInput=false;
        for (int index=0;index<numbers.length;index++) {
            if (input != numbers[index]) {

            } else {
                numbers[index] = 0;
                arrayContainInput = true;
            }
        }
        if (!arrayContainInput) {
            System.out.println(false);
        }else {
            System.out.println(Arrays.toString(numbers));
        }
    }
}
