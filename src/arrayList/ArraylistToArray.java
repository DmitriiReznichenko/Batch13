package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArray {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Philipines");
        countries.add("Canada");

        System.out.println(countries);
        Object[] countriesArray=countries.toArray();

        System.out.println(Arrays.toString(countriesArray));
        countriesArray[0]="usa";
        System.out.println(Arrays.toString(countriesArray));
        countriesArray[4]="newCountry";
        System.out.println(Arrays.toString(countriesArray));
    }
}
