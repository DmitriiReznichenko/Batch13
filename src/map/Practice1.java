package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {


        HashMap< Integer, String> studentsMap=new HashMap<>();
        studentsMap.put(111, "David");
        studentsMap.put(222,"Mustafa");
        studentsMap.put(333,"Anna");
        studentsMap.put(777,"James");
        studentsMap.put(555,"Bond");
        studentsMap.put(1,"Dima");
        studentsMap.put(111,"Sam");
        System.out.println(studentsMap);


        studentsMap.put(666,"Sum");
        System.out.println(studentsMap);
        System.out.println(studentsMap.get(666));


        String name1=studentsMap.get(333);
        System.out.println(name1.concat(" Hello"));

        studentsMap.put(null, "Tima");
        System.out.println(studentsMap);

        studentsMap.put(null,"John");
        System.out.println(studentsMap);

        studentsMap.put(888,null);
        studentsMap.put(444,null);
        studentsMap.put(999,null);

        System.out.println(studentsMap);
        studentsMap.get(111);


        Set<Integer> keys=studentsMap.keySet();
        System.out.println(keys);
for (Integer key:keys){
    //System.out.println(studentsMap.get(key));
if (studentsMap.get(key)!=null){
    System.out.println(studentsMap.get(key).concat("@gmail.com"));
}
}

Collection<String> str=studentsMap.values();

        System.out.println("--------------------------");


        System.out.println(str);

       for (String  value:str){
           if (value!=null){
               System.out.println("hi "+value);
           }else System.out.println("Bue "+value);


       }



    }
}
