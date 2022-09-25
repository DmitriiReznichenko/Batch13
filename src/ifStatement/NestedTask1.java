package ifStatement;

import java.util.Scanner;

public class NestedTask1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is your city?");
        String city=input.nextLine();
        if (city.equalsIgnoreCase("chicago")){
            System.out.println("what is your school/course name");
            String school=input.nextLine();
            if (school.equalsIgnoreCase("techtorial")){
                System.out.println("You are lucky");
            }else {
                System.out.println("come  and visit techtorial");
            }
        }else {
            System.out.println("come to Chicago and visit techtorial");
        }









    }
}
