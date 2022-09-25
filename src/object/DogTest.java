package object;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.initialize("husky","King", "Gray");
        dog1.eat();
        dog1.eat();
        Dog dog2=new Dog();
        dog2.initialize("Bulldog","Bobby","Black");
        dog2.eat();
        dog2.eat();
        dog2.eat();

        System.out.println(dog1.food);
        System.out.println(dog2.food);
        System.out.println(dog1.name);
        System.out.println(dog2.name);
        Dog dog3=new Dog();
        dog3.food=30;
        System.out.println(dog1.food);
        System.out.println(dog2.food);

        dog3.play("Basement");
Dog.play("Park");
    }
}
