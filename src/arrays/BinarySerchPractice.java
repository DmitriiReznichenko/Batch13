package arrays;

import java.util.Arrays;

public class BinarySerchPractice {
    public static void main(String[] args) {
        int[] numbers = {21, 3, 6, 7 ,10, 65, 54, 2};


        System.out.println(Arrays.binarySearch(numbers,5));
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,54));
        System.out.println(Arrays.binarySearch(numbers,2));

    }

}
