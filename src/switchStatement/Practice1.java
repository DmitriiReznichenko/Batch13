package switchStatement;

public class Practice1 {
    public static void main(String[] args) {
        int number=9;
        switch (number){

            case 2:
                System.out.println("This is IT department");
                break;
            case 1:
                System.out.println("This is HR department" );
                break;

            case 3:
                System.out.println("This is Admin department");
                break;

            case 5:
                System.out.println("this is Help desk");
                break;

            default:
                System.out.println("no matching entry");
                break;
        }



    }
}
