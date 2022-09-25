package mentors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class InterviewTask {
    public static void main(String[] args) {
        int[] array={3,2,4};
        int target=6;

        B13:
        for (int i=0; i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]+array[j]==target){
                    System.out.println(i+" "+j);
                    break B13;
                }
            }
        }









    }










}
