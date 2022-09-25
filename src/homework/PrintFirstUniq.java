package homework;
import java.util.Scanner;
import java.util.Arrays;
public class PrintFirstUniq {
    public static void main(String[] args) {
        /*
        Create the array size of 7 and store every number by asking user via scanner in the loop.
         When asking user please use the text -> "Enter number for array" . After having all numbers
          for array print ONLY the first unique value from this array. If the array doesn't have any
           unique element print the text below "Array doesn't have any unique element"

EXAMPLE OUTPUT

Enter number for array 1 Enter number for array 2 Enter number for array 4 Enter number for array 1
Enter number for array 2 Enter number for array 3 Enter number for array 4
3 -> 3 is printed because array have [1,2,4,1,2,3,4] and first unique element from array is 3
         */
        String[] numbers=new String[7];
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<7;i++){
            System.out.println("Enter number for array");
            String number=scanner.nextLine();
            numbers[i]=number;
        }
        Arrays.sort(numbers);
        boolean arrayContainUnique=false;
        String unique="";
        for (int i=1;i<7;i++){
            if ( numbers[i]!=unique){
                unique=numbers[i];
                arrayContainUnique=true;
            }
        }
        if (!arrayContainUnique){
            System.out.println("Array doesn't have any unique element");
        }else {
            System.out.println(unique);
        }

    }

}
