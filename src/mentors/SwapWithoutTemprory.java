package mentors;

public class SwapWithoutTemprory {

    public static void main(String[] args) {
        int a=3;
        int b= 7;
        System.out.println("_________Before________");
        System.out.println("b= "+b);
        System.out.println("a= "+a);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("_________After________");
        System.out.println("b= "+b);
        System.out.println("a= "+a);



    }
}
