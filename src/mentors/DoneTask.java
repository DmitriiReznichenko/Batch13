package mentors;

import java.util.Scanner;

public class DoneTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        while (sum<100) {
            System.out.println("Please enter an integer number");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Done: "+sum);
    }
}
