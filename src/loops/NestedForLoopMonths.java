package loops;

public class NestedForLoopMonths {
    public static void main(String[] args) {

        for (int year=2020; year<2023; year++){
            System.out.print(year );
            for (int month= 1; month<=12; month++)
            {switch (month) {
                case 1:
                    System.out.print(" - January");
                    break;
                case 2:
                    System.out.print(" - February");
                    break;
                case 3:
                    System.out.print(" - March");
                    break;
                case 4:
                    System.out.print(" - April");
                    break;
                case 5:
                    System.out.print(" - May");
                    break;
                case 6:
                    System.out.print(" - June");
                    break;
                case 7:
                    System.out.print(" - JulY");
                    break;
                case 8:
                    System.out.print(" - Augest");
                    break;
                case 9:
                    System.out.print(" - September");
                    break;
                case 10:
                    System.out.print(" - October");
                    break;
                case 11:
                    System.out.print(" - November");
                    break;
                case 12:
                    System.out.print(" - December");
                    break;
            }




            }
            System.out.println();
        }
    }
}
