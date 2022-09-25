package ifStatement;

public class CurlyBracketPractice2 {
    public static void main(String[] args) {
        double money=100;
        double itemPrice=200;
        if (money<itemPrice)
            System.out.println("you can not buy this item");
        System.out.println("it is a sanny day");
        String color="White";

        if (color.length()<10)
            System.out.println("this color has less than 10 letters");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    int a=5, b=3,x;
    a++;
    if (a<b+b)
        b++;
     x=a + ++b;
    if (x>20)
        System.out.println(x);
    --x;
        System.out.println(x);
//++++++++++++++++++++++++++++++++++++++++++++++++
        if (a<b+b) {
            b++;

            x = a + ++b;
        }
        if (x>20) {
            System.out.println(x);
            --x;
            System.out.println(x);
        }

    }
}
