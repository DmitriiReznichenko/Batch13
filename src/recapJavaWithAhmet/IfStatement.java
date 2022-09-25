package recapJavaWithAhmet;

public class IfStatement {
    /* POSSIBLE INTERVIEW QUESTIONS:
 1-Many Technical questions hae if statement conditions for solution
 2-there are two condition for If Statements:True-False
 AND:=> true && true-->TRUE         OR: TRUE||TRUE--- > TRUE
        true && false-->TRUE            TRUE||FALSE-- >TRUE
        false && false-->TRUE           FALSE||FALSE-- >FALSE

          SUMMARY 1: I would say that for "and" condition the only way make the 2 conditions
                or more situations true-->both of them must be TRUE
          SUMMARY 2: I would say that for "OR" condition the only way to make the 2 conditions
                or more situations false--> both of them must be FALSE

  */
    public static void main(String[] args) {
        int cat=20, dog=10,rabbit=5;
        if (cat>dog && rabbit>dog || cat<rabbit){
            System.out.println("this condition is TRUE");

        }else if (cat>dog&&dog>rabbit||cat>rabbit){
            System.out.println("This condition is FALSE");
        }else {
            System.out.println("This condition is FALSE");

        }

        String ternaryOperator=cat>dog&&rabbit>dog||cat<rabbit ? "this condition is True":"this condition is FALSE";
        System.out.println(ternaryOperator);









    }

}
