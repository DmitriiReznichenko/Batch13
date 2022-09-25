package variable;

public class Practice2 {
    public static void main(String[] args){

     // Declaring variable

     int number ;   // Declaring variable which is giving data type and name the varible
        // Initializing variable

        number = 12; // Initializing variable which is giving a value to the variable
        System.out.println(number); // it will show 12
        System.out.println(number + 50); // it will show 62
        int studentNumber = 45;
        System.out.println(studentNumber - 2); // It will show 43
        int itemNumber;//
       // System.out.println(itemNumber);  // it will give compile time error, because variable itemNumber might not have been initialized

        studentNumber = 100;// updating the value for studentNumber --> reassigning a new value to the existing variable
        System.out.println("Student Number is now: "+studentNumber);// studentNumber is now : 100
        String city = "Chicago";
        int h=city.indexOf('h');


    }
}
