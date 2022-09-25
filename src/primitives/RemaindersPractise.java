package primitives;

public class RemaindersPractise {
    public static void main(String[] args) {
        /*
        find sum of the digits from integer number
        int number=123;
        1+2+3=6; "the sum of <number> is 6";
        345--->3+4+5=>12
         */
        int number=123;
        int temp=number;
        int digit1=number%10;
        number=number/10;
        int digit2=number%10;
        number=number/10;
        int digit3= number%10;
        System.out.println(digit3+digit2+digit1);



    }


}
