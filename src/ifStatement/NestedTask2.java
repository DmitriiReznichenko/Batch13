package ifStatement;

import java.util.Scanner;

public class NestedTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("do you know java (yes/no)?");
        String java = input.nextLine();
        if (java.equalsIgnoreCase("yes")) {
            System.out.println("do you know selenium(yes/no)?");
            String selenium = input.nextLine();
            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println("do you know api testing (yes/no)?");
                String api = input.nextLine();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("do you know SQL (yes/no)?");
                    String sql = input.nextLine();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("you are Hired!");
                    } else {
                        System.out.println("learn sql");
                    }
                } else {
                    System.out.println("learn api");
                }
            } else {
                System.out.println("learn selenium");
            }
        } else {
            System.out.println("learn java");
        }
    }
}
