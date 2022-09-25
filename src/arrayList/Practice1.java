package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>(6);
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        colors.add("gray");
        colors.add("pink");
        colors.add("violet");
        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        Collections.sort(colors);
        System.out.println(colors);
        Iterator iterator=colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
