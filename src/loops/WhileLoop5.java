package loops;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter  an integer number");
        int number= scanner.nextInt();
        int times=1;
        while (times<=10){
            System.out.println(number+"*"+times+"="+(number*times));
            times++;
        }



    }
}
