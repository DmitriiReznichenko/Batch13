package map;

import java.util.HashMap;
import java.util.TreeMap;

public class CountAndStore {
    public static void main(String[] args) {
        String[] alphabet={"a","b","c","a","a","d","c","e","d","b"};

        HashMap<String,Integer> map=new HashMap<>();

       for (String letter:alphabet){
           if (!map.containsKey(letter)) {
               map.put(letter, 1);
           }else {

              map.put(letter,map.get(letter)+1);
           }

       }
        System.out.println(map);


    }
}
