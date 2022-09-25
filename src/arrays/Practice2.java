package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        String[] colors=new String[7];
        colors[0]="Red";
        colors[6]="White";
        colors[1]="Blue";
        colors[2]="Pink";
        colors[3]="Purple";
        colors[4]="Yellow";
        System.out.println(Arrays.toString(colors));
        System.out.println("---------------");
        int l=colors.length;
        for ( int i=0; i<l;i++)
            System.out.println(colors[i]);
    }
}
