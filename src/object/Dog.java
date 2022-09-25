package object;

public class Dog {
    String breed;
     String name;
    String color;
    static int food=20;
    public void initialize(String breed1,String name1,String color1){
       breed=breed1;name=name1;color=color1;


    }
    public void eat(){
        --food;

        System.out.println(name +" is eating. New food amaunt:"+food);
            ;
    }
    public static void play(String place){
        System.out.println("Dog is plaing at "+ place);
        System.out.println("Dog is Playing and not eating,so food amount is still "+food);



    }
}
