package arrayList;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Task1 object=new Task1();
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("water");
        drinks.add("Tea");
        object.longer3Letters(drinks);



    }
    public void longer3Letters(ArrayList<String> list){
        ArrayList<String> list2=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            String word=  list.get(i);
            if (word.length()>3){
                list2.add(word);
            }
        }
        System.out.println(list2);
    }
}
