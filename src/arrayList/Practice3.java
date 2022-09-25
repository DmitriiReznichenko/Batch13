package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("Dallas");
        cities.add("New York");
        System.out.println(cities);
        //System.out.println(cities.get(4));

        cities.remove("Denver");
        System.out.println(cities);


String b =cities.remove(2);
        System.out.println(b);
        System.out.println(cities);
      //  cities.remove(2);
        System.out.println(cities);

cities.set(0,"LA");
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(" index of LA: "+ cities.indexOf("LA"));

        System.out.println(cities.isEmpty());
        cities.clear();
        System.out.println(cities.isEmpty());

        System.out.println(cities.indexOf("LA"));

        Boolean b2=cities.contains("Dallas");
        System.out.println(b2);


        ArrayList<String> drinks=new ArrayList<>();


        System.out.println( cities.addAll(cities));
        cities.addAll(drinks);
        System.out.println(cities);
        System.out.println(cities.addAll(1,drinks));


//String str="Java";
//str=str.replace('a','$');
//        System.out.println(str);


    }
}
