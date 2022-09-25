package loops;

import java.awt.*;

public class ContinueStatement {
    public static void main(String[] args) {
        LABEL:
        for (int i=0; i<9; i++){
            INNER:
            for (int k=0;k<15;k++){
                if (k>5&&k<10){
                    continue ;

                }
                System.out.print(i+ "<-- i  ");
                System.out.println(k+ "<-- k  ");

            }
            System.out.println("**************************");

        }
    }
}
