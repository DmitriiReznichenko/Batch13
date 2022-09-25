package primitives;

public class charclass {


    public static void main(String[] args) {

        char letter='M'; //decimal value of the letter M in ASII
        System.out.println('M'); //M
        System.out.println(letter); //M
        System.out.println(letter+ 100); //M100,177
        char letter1=77;
        System.out.println(letter1);
        char symbol=255;
        System.out.println(symbol);
        System.out.println(symbol+100);

        char digit='1';
        System.out.println(digit);
        System.out.println("================");
        int number='A';
        System.out.println(number);

        System.out.println(number+100);//165

        System.out.println(number+digit);// 65+49=114

        char digit1=1;
        System.out.println(digit1);
        char digit2=2;
        System.out.println(digit2);
        char digit3=36;
        System.out.println(digit3);



    }
}
