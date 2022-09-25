package recapJavaWithAhmet;

public class ConstructorPracticeHuman {
    int age=30;
    String  name="Ahmet";
    double height=6.2;
    String eyeColor="Brown";
    double amountOfMuscles=45.5;
    String lastName;

    public ConstructorPracticeHuman(int age, String name, double height, String eyeColor, double amountOfMuscles, String lastName) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.amountOfMuscles = amountOfMuscles;
        this.lastName = lastName;

    }


public void printInformation(){
    System.out.println(age);
    System.out.println(name);
    System.out.println(height);
    System.out.println(eyeColor);
    System.out.println(amountOfMuscles);
    System.out.println(lastName);
}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("your gc worked");
    }

    public String getName(){
        return name;
}
public void printName(){
    System.out.println("my kid's name is "+this.getName());
}
    public ConstructorPracticeHuman() {
    }
    public static void main(String[] args) {
    ConstructorPracticeHuman constructorPracticeHuman=new ConstructorPracticeHuman();
    constructorPracticeHuman.printInformation();
    ConstructorPracticeHuman male=new ConstructorPracticeHuman(25,"Rakata",7.6,"green",20.5,"tatata");
    ConstructorPracticeHuman female=new ConstructorPracticeHuman(26,"Ana",5.6,"blue",20.3,"merver");
    ConstructorPracticeHuman kids=new ConstructorPracticeHuman(5,"Ratana",2.1,"brown",5,"mertata");
            male.printInformation();
            female.printInformation();
            kids.printInformation();


        System.out.println("my k id's name is "+ constructorPracticeHuman.getName());
male=female;
        //male=null;
       // male=kids;
female=null;
//female=kids;
        System.gc();
    }
}
