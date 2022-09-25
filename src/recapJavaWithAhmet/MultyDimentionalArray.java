package recapJavaWithAhmet;

import java.util.Arrays;
import java.util.HashMap;

public class MultyDimentionalArray {
    /*
 POSSIBLE INTERVIEW QUESTIONS:

 *there is no specific interview verbal question for this part. But there is task
 about it:

 TASK:

 //Create a cost of array(STRING) //$23,$45,$32,$18
 //Create another month of array(STRING) //Jan,Feb,Aug,Oct

 //Put them in a map format(DO NOT USE MAP) with Multidimensional array (key=value)
 //key->month value->cost

OUTPUT; Jan =$23   Feb=$45,  Aug = $32 Oct = $18

TIPS:ONE LOOP IS ENOUGH TO SOLVE THIS QUESTION
TIP: String[][] allTogether=new String[][];*/
    public static void main(String[] args) {
        String[] cost={"$23","$45","$32","$18"};
        String[] month={"Jan","Feb","Aug","Oct"};
       /* HashMap<String ,String> multiDimentionalArray=new HashMap<>();
        for (int i=0; i<cost.length;i++) {
            multiDimentionalArray.put(month[i],cost[i]);
        }
        System.out.println(multiDimentionalArray);*/
        String[][] multiDimentionalArray=new String[2][4];
        for (int i=0; i<cost.length;i++) {
            multiDimentionalArray[0][i]=month[i];
            multiDimentionalArray[1][i]=cost[i];
            System.out.println(multiDimentionalArray[0][i]+"="+multiDimentionalArray[1][i]);
        }
        System.out.println(Arrays.deepToString(multiDimentionalArray));
    }
}
