package variable;

public class Practice1 {



    public static void main(String[] args){

        // java executes the code from top-botton and left-right
        int apples = 5;
        int oranges =3;
        int mango = 6;

        int apples$ =2;
        int oranges$ =3;
        int mango$ = 1;

        int totalapples$ = apples * apples$;
        int totaloranges$ = oranges * oranges$;
        int totalmango$ = mango * mango$;


        System.out.println(5+3+6);

        System.out.println(apples+oranges+mango);

        System.out.println("There are "+ (apples+oranges+mango) +" fruits");
System.out.println("The total cost of fruits is $"+(apples*apples$+oranges*oranges$+mango*mango$));
        System.out.println("The total cost of fruits is $"+(totalapples$+totaloranges$+totalmango$));
    }
}
