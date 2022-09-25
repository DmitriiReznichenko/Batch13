package scanner;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        String text = new String();
         text=       " Java";
        System.out.println(text);
        Scanner scanner= new Scanner(System.in);

        String myName= " Sam";
        System.out.println("PlEASE enter your name");
        myName= scanner.nextLine();
        System.out.println("Hello, " + myName);
        System.out.println(" Please, enter your last Name");
        String lastName = scanner.nextLine();
        System.out.println("Your Full name is: "+myName+" " +lastName);
        System.out.println("Please enter your zip code");
        int zipCode = scanner.nextInt();
        System.out.println("Hey "+myName+" your  are living in this "+zipCode+ " Zipcode");
        System.out.println("Please enter your adress");
        scanner=new Scanner(System.in);
        String adress= scanner.nextLine();
        System.out.println("Your adress is ******** " +adress+" ***********");
        System.out.println("Please enter your zip code");








    }
}
