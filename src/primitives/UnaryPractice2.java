package primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {

        int burgers=23;
        int sum = burgers++ + ++burgers + 5 + ++burgers/2;
        System.out.println("the sum is " +sum);

        int a = ++burgers, b= a++, c= --burgers;
        System.out.println(++a + --b);



    }


}
