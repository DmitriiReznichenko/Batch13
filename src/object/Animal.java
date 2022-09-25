package object;

public class Animal {
    // instance variables, they are out of any block/scope, in the class
    int age=5;
    String  breed;
    char gender;
    String color="orange";
    String name;
    int energy=100;

public  void sleep(){
    energy=100;
    System.out.println(name+ " is sleeping");


}
    public  void run() {
        energy = energy - 10;
        System.out.println(name + " is running");
    }

        public void printInfo () {
            System.out.println(energy + " energy of " + name);
            System.out.println(age + " age of " + name);
            System.out.println(color + " color of " + name);
            System.out.println(gender + " gender of " + name);
            System.out.println(age + " age of " + name);


        }

}
