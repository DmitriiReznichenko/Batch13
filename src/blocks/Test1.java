package blocks;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("Test");
        Practice Practice1=new Practice();
        Practice Practice2=new Practice();
        Practice Practice3=new Practice();
        Practice Practice4=new Practice();

        System.out.println(Practice1.name);

        Practice1.name="Robert";
        System.out.println(Practice1.name);
        System.out.println(Practice2.name);
        System.out.println(Practice1.name);
        Practice1.number=200;
        System.out.println(Practice1.number);
        System.out.println(Practice2.number);


    }

}
