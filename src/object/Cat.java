package object;

public class Cat {
    int age=8;
    int food=12;
    String name="Matroskin";
    String color="White-black";
    int legs=4;
    public void meowing(){
        System.out.println(name+" is meowing");
    }
    public void info(){
        System.out.println(   name+" is name of cat");
        System.out.println(   age+" is age of "+ name);
        System.out.println(   color+" is color of "+ name);
        System.out.println(   name+ " has "+ legs+" legs");
    }
    public void eat(){
        food=food-1;
        System.out.println(name+ " is eating. it have "+ food+" food");
    }
    public void walk(int destination){
        System.out.println(name+ " is walking "+ destination+" miles");
    }
    public void setColor(String color1){
        color=color1;
    }
    public String setColor2() {

        return color;
    }
    public void setName(String firstName){
        name=firstName;
    }
    public String getName(){
        return name;
    }
}
