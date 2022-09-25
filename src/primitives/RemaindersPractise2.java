package primitives;

public class RemaindersPractise2 {

    public static void main(String[] args) {
        int number=138, temp=number;
        int digit1=number%10; number=number/10;
        int digit2=number%10; number=number/10;
        int digit3= number%10;
        System.out.println("the product of digits from given number "+temp+" is "+(digit1*digit2*digit3));
    }
}
