package accessModifiers;

public class Child extends Person {

    public static void main(String[] args) {


        Person mustafa=new Person();
        mustafa.speakProtected();
        mustafa.speakPublic();
        mustafa.speakDefault();
        Child child=new Child();
        child.speakPublic();
        child.speakDefault();
        child.speakProtected();




    }


}
