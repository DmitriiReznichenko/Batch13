package arrays;

import java.util.Arrays;

public class Multydementional3 {
    public static void main(String[] args) {
        String[][] citiesOfStates=new String[5][2];
        System.out.println(Arrays.deepToString(citiesOfStates));
        //System.out.println(citiesOfStates[5][0]);
        //System.out.println(citiesOfStates[0][2]);
String[][] citiesOfStates1={{"Chicago","Springfield"},{"Tampa"},{"Houston","Dallas","Austin"},{"Brooklyn"}};
        System.out.println(Arrays.deepToString(citiesOfStates1));
        System.out.println(citiesOfStates1[3][0]);
Arrays.sort(citiesOfStates1[0]);
        System.out.println(Arrays.toString(citiesOfStates1[0]));

        for (int i=0;i<citiesOfStates1.length;i++){
            for (int k=0;k<citiesOfStates1[i].length;k++){
                System.out.println(citiesOfStates1[i][k]);
           //     System.out.println(citiesOfStates1[i].length);
            }
            System.out.println(citiesOfStates1[i].length); //count of cities in each state(number of elements in inner array)
        }
        System.out.println("*********************************");
        for (String[] cities:citiesOfStates1){
            System.out.println(cities.length);
            for (String city:cities){
                if (city.equalsIgnoreCase("Tampa")|| city.equalsIgnoreCase("Houston")){
                    System.out.print(city+ " - It Must be really hot over During the summer" );
                    System.out.println("");
                }else
                System.out.println(city);

            }
        }

    }
}
