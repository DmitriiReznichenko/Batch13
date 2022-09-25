package object;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        String str=new String();
        Scanner scanner=new Scanner(System.in);
        Animal cat=new Animal();
        System.out.println(cat.color);
cat.color="White";
        System.out.println(cat.color);
        System.out.println(cat.age);
        cat.age=3;
        System.out.println(cat.age);
        System.out.println(cat.breed);

        System.out.println(cat.gender);
cat.gender='f';
cat.breed="scottish";
        System.out.println(cat.breed);

        System.out.println(cat.gender);
        System.out.println("------------");
        Animal dog=new Animal();
        System.out.println(dog.color);
        dog.color="black";
        System.out.println(dog.color);
        System.out.println(dog.age);
        dog.age=8;
        System.out.println(dog.age);
        System.out.println(dog.breed);

        System.out.println(dog.gender);
        dog.gender='m';
        dog.breed="labrador";
        System.out.println(dog.breed);

        System.out.println(dog.gender);
        System.out.println(dog.color.concat(dog.breed).equalsIgnoreCase("blacklabrador"));


        Animal[] animals={cat,dog};
        System.out.println(animals[0].color);
        System.out.println(animals[1].color);
for (Animal pet:animals){
    System.out.println(pet.color);
    System.out.println(pet.gender);
    System.out.println(pet.age);
    System.out.println(pet.breed);


}


    }
}
