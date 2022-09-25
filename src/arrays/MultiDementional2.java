package arrays;

import java.util.Arrays;

public class MultiDementional2 {
    public static void main(String[] args) {
        String[][] citiesOfStates= new String[3][2];
        citiesOfStates[0][0]="Chicago";
        citiesOfStates[0][1]="Springfield";
        citiesOfStates[1][0]="Maiami";
        citiesOfStates[1][1]="Tampa";
        citiesOfStates[2][0]="LA";
        citiesOfStates[2][1]="San Diego";

        for (String[] citiesArray:citiesOfStates ) {
            for (String city:citiesArray ) {
                System.out.println(city);
            }
        }
        String[] florida= citiesOfStates[1];
        System.out.println(Arrays.toString(florida));

    }
}
