package switchStatement;

import java.util.Scanner;

public class NastedSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please chose from following departments: \n 1- IT \n 2- HR \n 3-Admin");
        int department = scanner.nextInt();
        switch (department){
            case 1:
                System.out.println("Who do you want to speak from IT department? \nAlex \nZack \nDiana");
                String name=scanner.next().toUpperCase();
                switch (name) {


                    case "ALEX":
                        System.out.println("you are connected to ALEX");
                        break;
                    case "ZACK":
                        System.out.println("you are connected to ZACK");
                        break;
                    case "DIANA":
                        System.out.println("you are connected to DIANA");
                        break;
                    default:
                        System.out.println("There is no specialist with this name");
                        break;
                }
                break;
            case 2:
                System.out.println("Who do you want to speak from HR department? \nTima \nAnna");
                String nameHR=scanner.next().toUpperCase();
                switch (nameHR){
                    case "TIMA":
                        System.out.println("you are connected to Tima");
                        break;
                    case "ANNA":
                        System.out.println("you are connected to ANNA");
                        break;
                    default:
                        System.out.println("There is no specialist with this name");
                        break;
                }
                break;
            case 3:
                System.out.println("Who do you want to speak from ADMIN department? \nDavid \nTima");
                String nameAdmin=scanner.next().toUpperCase();
                switch (nameAdmin){
                    case "TIMA":
                        System.out.println("you are connected to Tima");
                        break;
                    case "David":
                        System.out.println("you are connected to David");
                        break;
                    default:
                        System.out.println("There is no specialist with this name");
                        break;
                }
                break;
            default:
                System.out.println("no matching department for your entre, You are connecting to John");
                break;
        }



    }
}
