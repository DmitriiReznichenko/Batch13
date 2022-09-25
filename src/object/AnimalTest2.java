package object;

public class AnimalTest2 {
    public static void main(String[] args) {
        Animal bird=new Animal();
        System.out.println(bird.color);
        bird.name="Tweeter";
        bird.sleep();

        Animal cat=new Animal();
        cat.name="tom";
        cat.sleep();
        Animal eagle=new Animal();
        eagle.name="Zee";
        eagle.run();
        System.out.println(cat.energy);
        cat.run();
        System.out.println(cat.energy);
        cat.run();
        cat.run();
        cat.run();
        cat.run();
        cat.run();
        cat.run();
        cat.run();
        cat.run();
        System.out.println(cat.energy);
        System.out.println(eagle.energy);
eagle.sleep();
        System.out.println(eagle.energy);
        eagle.printInfo();





    }
}
