package blocks;

public class Practice {
    String name;
    static int number;



    {

        name="Bob";
        System.out.println("Instansce Block");

        run();
        System.out.println(number);
    }
    static {
        number=100;
        System.out.println("Static Block");
        awake();
    }
    public void run(){
        System.out.println("Running");
    }
    public static void awake(){
        System.out.println("Not sleeping");
    }

}
