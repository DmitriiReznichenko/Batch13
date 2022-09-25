package oOP.abstraction.interface2;

public class Duck extends CanRun implements  CanFly, CanSwim{

    public void fly(){
        System.out.println("Duck is flying");
    }
    public void landing(){
        System.out.println("Duck is landing");
    }
    public void run(){
        System.out.println("Duck is running");
    }
public void swim(){
    System.out.println("Duck is swimming");
}
public void diving(){
    System.out.println("Duck is diving");
}
public void speeding(){
    System.out.println("Duck is speeding");
}



}
