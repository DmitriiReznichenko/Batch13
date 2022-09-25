package string;

public class EqualsMethod {
    public static void main(String[] args) {
        String name1= new String("David");
        String name2= new String("David");
        String name3= "David";
        String name4= "David";
        String name5= name1;
        System.out.println(name1.equals(name2));
        System.out.println(name3.equals(name4));
        System.out.println(name1==name2);
        System.out.println(name3==name4);
        System.out.println(name1.equals(name4));
        System.out.println(name1==name4);
        System.out.println(name5.equals(name1));
        System.out.println(name1==name5);













    }
}
