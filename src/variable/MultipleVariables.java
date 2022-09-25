package variable;

public class MultipleVariables {


    public static void main(String[] args) {

        int num=1;

        int num2=5;
        int a,b,c,d;
        double x=23.1, y=12.3,z; //it is possible to declare and/or initialize multiple variables
                                  // on the same line if they are having same data tupe.
                                    //they should be separated by comma

        byte b1=2;
        short sh1=3;
        a=b1 +5 + sh1;
        System.out.println(a);
        a = num2+b1;
        System.out.println(a);

        //int a=11;
        //using underscores
        int number =3_000_000;
        long number1=4_555_671_645_542_552L;

    }
}
