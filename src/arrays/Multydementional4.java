package arrays;

import java.util.Arrays;

public class Multydementional4 {
    public static void main(String[] args) {
       /* Computers
                dell, Acer, HP,MacPro,MacAir

                Tvs
Samsung, LG,Sony, Hisense
                        Speakers
                                Alexa, Google, JBL, Sonnos, Beats
                                ++++++++++++++++++++++++++++++++++
                                        Prices:
        computers:
        1400,1100,899.99,2400,1200
                tv:1500,800,765.99,385.99
                        speakers
                                99.99,69.00,150,200,15.99
         */
        String[][] devices={{"Dell","Acer","HP","MacPro","MacAir"},{"Samsung","LG","Sony","Hisense"},{"Alexa","Google","JBL","Sonnos","Beats"}}    ;
        double[][] prices={{1400,1100,899.99,2400,1200},{1500,800,765.99,385.99},{99.99,69.00,150,200,15.99}};
        for (int a=0;a<devices.length;a++){
            for (int b=0;b<devices[a].length;b++){
                System.out.println("The Price for "+devices[a][b]+" is $ "+ prices[a][b]);
            }


                /*String[] item:store) {
            for (double[] price:prices) {
                System.out.println(" is the price for "+ Arrays.deepToString(item));
            }*/

        }
        for (int a=0;a<devices.length;a++){
            for (int b=0;b<devices[a].length;b++) {
                if (prices[a][b] < 500) {
                    System.out.println("These are devices for for less than $500: " + devices[a][b]);
                }
            }
        }
        for (int a=0;a<devices.length;a++){
            for (int b=0;b<devices[a].length;b++) {
                if (devices[a][b].contains("Mac")||devices[a][b].contains("Beats") ) {
                    System.out.println("These  devices by Apple: " + devices[a][b]+" -> $" +prices[a][b]);
                }
            }
        }













    }
}
