package arrays;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {

        int[] numbers={4,3,7,19,23,440,1,100};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);
        String[] snacks={"chips","fries","cookies","fruit","broccoli"};
        System.out.println(Arrays.toString(snacks));
        //Arrays.sort(snacks);
        System.out.println(Arrays.toString(snacks));
        for (int index=0;index<snacks.length;index++)
            snacks[index]=snacks[index].toUpperCase();
        Arrays.sort(snacks);
        System.out.print(Arrays.toString(snacks));
    }
}
