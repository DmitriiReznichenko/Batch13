package map;

import java.util.HashMap;
import java.util.TreeMap;

public class CountStore {
    public static void main(String[] args) {
        String name="Dmitrii Reznichenko";
        HashMap<Character,Integer> letterCount=new HashMap<>();
        for (int i=0;i<name.length();i++){
            if (!letterCount.containsKey(name.charAt(i))) {
                letterCount.put(name.charAt(i), 1);

            }else {
                letterCount.put(name.charAt(i),letterCount.get(name.charAt(i))+1);
            }
        }
        System.out.println(letterCount);
letterCounter("Valeriia Putilina");

    }
    public static HashMap<Character,Integer> letterCounter(String name){
        HashMap<Character,Integer> letterCount=new HashMap<>();
        for (int i=0;i<name.length();i++){
            if (!letterCount.containsKey(name.charAt(i))) {
                letterCount.put(name.charAt(i), 1);

            }else {
                letterCount.put(name.charAt(i),letterCount.get(name.charAt(i))+1);
            }

        }System.out.println(letterCount);
        return letterCount;
    }
}
