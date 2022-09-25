package oOP.abstraction.interface2;

public class Test {

    public static void main(String[] args) {
Bird bird= new Bird();
bird.run(); // CanRun
bird.fly(); // CanFly
bird.landing(); // CanFly
        System.out.println("===============");
Fish fish=new Fish();
fish.swim();// CanSwim
fish.diving();//CanSwim

        System.out.println("====================");
Duck duck=new Duck();
duck.diving();
duck.fly();
duck.run();
duck.landing();
duck.swim();

Bird bird2=new Bird();
CanFly bird1= new Bird();

Duck duck1=new Duck();
duck1.swim();
CanFly duck2=new Duck();
duck2.fly();
CanSwim duck3=new Duck();
duck3.swim();
CanRun duck4=new Duck();
    }
}
