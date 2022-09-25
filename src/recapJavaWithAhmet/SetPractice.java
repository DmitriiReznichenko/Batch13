package recapJavaWithAhmet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
   /*
   SET
   INTERVIEW  QUASTION
   1.How can you make the element unique with collection?
   (What is set ? What is purpose of using it?)
   (In what condition do you use set in your project? Can you give me an example?)

   - -> I can make the all elements (data) unique by using SET collectione
   2. Can you tell me the types of collections?

   --> SET
   --> LIST
   --> QUEUE
   3. Can you explain the difference between SET and LIST?

   --> List:                                   SET:
   1- can store duplicates                     1-Only unique
   2- It has indexing (for, foreach)           2- It doesn't have indexing
   3- Syntax is different                      3- Syntax is different
   List list=new ArrayList()                   Set set =new HashSet();

   4. What is the difference between SET types?
   --> HashSet --> it stores the element no order(randomly)
   -->LinkHashSet--> it stores the element insertion order ( the way that you assign)
   --> TreeSet --> it stores the element ascending order.





    */


    public static void main(String[] args) {
        Set numbers=new TreeSet();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);
        System.out.println(numbers);

    }
}
