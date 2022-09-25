package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] countries={"USA","Mexico","Canada"};

        List<String> countriesList=Arrays.asList(countries);
        System.out.println(countriesList);
    countriesList.set(0,"usa");
        System.out.println(countriesList);
    List items=Arrays.asList(1,2,3,4,5,6);

        System.out.println(items);

        List items2=Arrays.asList("bee","butterfly","spider","fly","mosquito");
        System.out.println(items2);
    List l2=new ArrayList();
    l2.addAll(items2);
    l2.add("xyz");
        System.out.println(l2);
    }
}
