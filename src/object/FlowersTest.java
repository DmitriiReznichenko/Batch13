package object;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlowersTest {
    public static void main(String[] args) {
        Flower a=new Flower("Rose","large","red",12);
        Flower b=new Flower("Aster","large","White",12);
        Flower c=new Flower("Azalea","short","Yellow",15);
        Flower d=new Flower("Buttercup","short","Black",5);
        Flower[] vase1= new Flower[4];
        vase1[0]=a;
        vase1[1]=b;
        vase1[2]=c;
        vase1[3]=d;


        Flower[] vase2={a,b,c,d};
        System.out.println(Arrays.toString(vase1));
        a.priceChecker(vase2);













    }






}
