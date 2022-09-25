package recapJavaWithAhmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    /*
    Possible Interview question:

    NOTE: Once you start any explanation go with general to deep


    1- What is wrapper class?
        ==>it is a way (process) to convert data into different forms.
        ==> Primitive to Object
        ==>Object to Primitive


    2- How many ways of wrapper class do you know?2.1- Cam you tell me about autoboxing and unboxing?
        ==> Autoboxing: Primitive to Object.it is a way to convert from Primitive to Object
        ==> Unboxing: >Object to Primitive. It is a way to convert from Object to Primitive



    3-  Where do you use wrapper class in your project?
    I using it in my collections/

     */
    public static void main(String[] args) {
        //Collections store only OBJECTS
        //this is an example of autoboxing and it doesn't require and extra methods or energy for conversion
        List<Integer> numbers=new ArrayList<>();
        int age=30; //primitive
        numbers.add(age); //Primitive--> Objects(once it stores in the list then it has object methods)
        System.out.println(numbers);


       //  numbers.get(0)....
        //this is an example of unboxing and it requires extra methods or energy for conversion(parsing)

        String nmbr="12";
        int number=Integer.parseInt(nmbr);
        System.out.println(number);


        //String value of is not a wrapper class.  it seems like autoboxing but it is not.
        //WHENEVER YOU NEED TO MANIPULATE DATA, YOU SHOULD USE STRING VALUE OF.
        int num=7;
        String a=String.valueOf(num);
        System.out.println(a);










    }

}
