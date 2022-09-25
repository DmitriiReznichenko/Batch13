package oOP.abstraction.abstract1;

public abstract class Student {

    int age;


    String name;

    public Student( String name,int age) {
        this.age = age;
        this.name = name;
    }
public abstract void study();
public abstract Integer watch(String day);
public void eating(){

    System.out.println(name+ " eating");
}





}
