package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Strawberry", "LA");
        map.put("Watermelon", "Chicago");
        map.put("Apple", "Madison");
        map.put("Potatoes", "Idaho");
        map.put("banana", "miami");
        System.out.println(map);
        System.out.println(map.entrySet());
        Set< Map.Entry<String,String>> keysAndValues=map.entrySet();

for (Map.Entry<String,String > pair:keysAndValues){
    System.out.println(pair);
}
        System.out.println("=========================");
        System.out.println(map.values());
        System.out.println("=====================");
        System.out.println(map.keySet());




    }
}
