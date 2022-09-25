package arrayList;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        ArrayList <String> shoppingList=new ArrayList();
        shoppingList.add("Shoes");
        shoppingList.add("Hat");
        shoppingList.add("Cup");
        shoppingList.add("glasses");
        shoppingList.add(2,"Milk");


        boolean b=true;
        shoppingList.add(Boolean.toString(b));

        System.out.println(shoppingList);

        System.out.println(shoppingList.get(0));

        String item1=shoppingList.get(1);
        System.out.println(item1);
        System.out.println(shoppingList.size());

        int count=shoppingList.size();
        Integer count1=shoppingList.size();
        System.out.println(count);
        System.out.println(count1);
        System.out.println(shoppingList.get(shoppingList.size()-1));





    }
}

