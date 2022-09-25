package inharitance;

public class Zoo {
    public static void main(String[] args) {
Animal animal=new Animal();
        System.out.println(animal.name);
        animal.color="Brown";
        System.out.println(animal.color);

        System.out.println("---------domestic");
        DomesticAnimal domesticAnimal=new DomesticAnimal();
        System.out.println(domesticAnimal.name);
        System.out.println(domesticAnimal.color);
        System.out.println("---------wild");
        WildAnimal wildAnimal=new WildAnimal();
        System.out.println(wildAnimal.name);
        System.out.println(wildAnimal.color);
        System.out.println("----------cat");
        Cat cat=new Cat();
        System.out.println(cat.name);
        System.out.println(cat.color);
        cat.color="orange";
        System.out.println(cat.color);



    }
}
