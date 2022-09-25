package object;

public class CatTest {
    public static void main(String[] args) {
        Cat object=new Cat();
        object.info();
        object.meowing();
        object.eat();
        System.out.println();
        object.walk(70);
object.setColor("yellow");
        System.out.println(object.name);
        object.setName("Ginger");
        object.name=object.name.concat("White");
        System.out.println(object.name);


    }
}
