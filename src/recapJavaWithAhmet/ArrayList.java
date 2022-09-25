package recapJavaWithAhmet;

import java.util.LinkedList;
import java.util.List;

public class ArrayList {
    /*
   POSSIBLE INTERVIEW QUESTION:
   1-What is the difference between Array and ArrayList?
   Arrays:                                             ArrayList:
   -fixed size                                      -Dynamic/Flexible size
   -Multidimensional Form                           -Doesn't have this form
   -Stores primitives and Object                    -Only stores Object
   -doesn't have methods for manipulation           -has methods(add,remove,get,replace)
   -Syntax is different                             -Syntax:
   int[] number=new int[3];                         List<Integer> number=new ArrayList();
   int[] number={1,2,3};                            ArrayList<Integer> number=new ArrayList();
   indexing-->number[0]                              indexing-->number.get(0)

   NOTE:COMMON POINT OF ARRAY AND ARRAYLIST
   *******THEY BOTH ARE INDEXING********

   2-What is difference between ArrayList and LinkedList?
   I do not use LinkedList in my project often but efficiency of reaching out the element in ArrayList "FASTER" than LinkedList.
   ** IN SUMMARY; the efficiency of ARRAYLIST is better to reach out element
   ** the efficiency of LINKEDLIST is better to manipulate data.
   IN ADDITION: LINKEDLIST has extra methods.

    */
    public static void main(String[] args) {
        List<Integer> number=new java.util.ArrayList<>();
        int[] numbers=new int[3];
        Object[] number1={"1",true,1,1.5,"ahmet"};
        number.add(1);
        number.add(0);
        number.remove(0);
        LinkedList<Integer> numberLink=new LinkedList<>();
        numberLink.add(1);
        numberLink.add(2);
        System.out.println(numberLink.getLast());
        System.out.println(numberLink.getFirst());

    }
}
