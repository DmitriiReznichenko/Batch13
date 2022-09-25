package arrayList;

import object.Cookie;
import object.Flower;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        List items=new ArrayList();
        items.add("String");
        items.add(22);
        items.add(new Flower("Rose",11));
        ArrayList list1=new ArrayList();
        list1.add(33);
        list1.add(true);
        list1.add("Phone");

        list1.add(new Cookie());
        list1.add(new Scanner(System.in));
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.get(list1.size()-1));


    }
}
