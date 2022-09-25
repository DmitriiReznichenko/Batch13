package primitives;

public class Unary {
    public static void main(String[] args) {
        int flower= 7;
        System.out.println(flower);
        flower++;
        System.out.println(flower);
        flower--;
        System.out.println(flower);
        flower--;
        flower--;
        flower--;
        flower++;
        System.out.println(flower);



        int item =6;

           int count =(item--) +item-- ;
        System.out.println(count);

        int num=3;
        System.out.println(num++);


    }
}
