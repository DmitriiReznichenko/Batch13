package oOP.abstraction.interface1;

public class Test {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle.calculateArea());


        triangle.melt();

        Square square=new Square();
square.calculateArea();



        Shape t1=new Triangle();
        t1.getPerimetr();

        Shape sq1=new Square();
        System.out.println( sq1.calculateArea());



    }
}
