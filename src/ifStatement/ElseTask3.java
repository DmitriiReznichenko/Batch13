package ifStatement;

import java.util.Scanner;

public class ElseTask3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pleas enter your zipcode");
        int zipCode=input.nextInt();

        if (zipCode%2==0){
            System.out.println("you are living in  an Even number zip code");
        }else {
            System.out.println("you are living in  an ODD number zip code");
        }





    }
}
