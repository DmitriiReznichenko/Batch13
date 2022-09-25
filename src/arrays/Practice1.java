package arrays;

import java.sql.Array;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] ids=new int[5];
        System.out.println(ids);
        ids[1]=11;
        ids[3]=33;
        int l=ids.length;
        System.out.println(ids[0]);
        System.out.println(ids[1]);
        System.out.println(ids[3]);
        System.out.println("lenght of array is "+l);
        System.out.println("------------------");
        for (int i=0; i<l;i++){
            System.out.println(ids[i]);
        }
        ids[0]=9;
        ids[1]=88;
        System.out.println(ids[1]);
        System.out.println("!!!"+Arrays.toString(ids) );
        System.out.println("____________________-");
        ids[4]=44;
        System.out.println(ids[4]);

       // ids[5]=55;
       // System.out.println(ids[5]);
    }
}
