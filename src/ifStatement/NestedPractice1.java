package ifStatement;

public class NestedPractice1 {
    public static void main(String[] args) {
        boolean passport=false, visa=true,ticket=true;
        if (passport==true){
            System.out.println("You can try for visa");
            if (visa==true){
                System.out.println("You can buy ticket");
                if (ticket==true){
                    System.out.println("good news, you can fly to your destination");

                }else {
                    System.out.println("you need to buy ticket");
                }
            } else {
                System.out.println("You need to get Visa");
            }
        }else {
            System.out.println("you need to get A passport");
        }










    }
}
