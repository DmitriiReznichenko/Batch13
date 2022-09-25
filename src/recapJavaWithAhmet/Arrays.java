package recapJavaWithAhmet;

public class Arrays {
    /*POSSIBLE INTERVIEW QUESTIONS:
    1-What is the difference between Array and ArrayList?
    Arrays- is the storage for multiple elements
    1* Array has fixed size(you give the length for the array at the beginning and it is not flexible)
    2* Arrays cannot be manipulated( it doesn't have methods)
    3* Array can store Primitives and Objects
    4* Array has a length feature
    5* Array has multidimensional form.***
    interview question task:
    write an implementation that declare int array and find the://
    1-sum of even number
    2-sum of the odd number
    3-difference between them(a-b or b-a)
     */
    public static void main(String[] args) {
        int[] numbers={1,2,3,8,12,65,76,5,22,12};
        int sumOfEven=0;
        int sumOfOdd=0;
       // int defference=0;
        for (int number:numbers
             ) {
            if (number%2==0) {
                sumOfEven += number;
            }else {
                sumOfOdd+=number;
            }


        }
        System.out.println(sumOfEven +" is sum of even numbers");
        System.out.println(sumOfOdd+" is sum of odd numbers");
        /*if (sumOfEven>sumOfOdd){
            defference=sumOfEven-sumOfOdd;

        }else {
            defference=sumOfOdd-sumOfEven;
        }
        */
         int defference=sumOfEven>sumOfOdd ?sumOfEven-sumOfOdd:sumOfOdd-sumOfEven;
        System.out.println(defference + " is difference of sum of even and sum of odd numbers");







    }



}
