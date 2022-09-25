package object;
import java.util.Arrays;
public class Clock {
    int countOfNumbers;
    String shape;
    boolean sound;
    // override toString method in this class to see properties of any Clock abject
    public String toString(){
        return  countOfNumbers + ", "+shape+", "+sound;
    }
    // create a method which defined by using var args as parameter
    // this method will find out average miles that a person runs in a week(7)
    // 5, 7, 10, 2, 0, 0, 5
    public static void averageMiles(int ... mile){
        int sum = 0, average;
        for (int number: mile){
            sum = sum + number;
        }
        average = sum/7;
        System.out.println(average);
    }
    public static void main(String[] args) {
        averageMiles(4,5,6,7,8,9,0);
        averageMiles(10,11,4,0,3);
        int number = 25;
        System.out.println( number  );
        Clock clock = new Clock();
        System.out.println(    clock   );
        Clock clock1 = new Clock();
        clock1.shape = "Rectangle";
        System.out.println(   clock1   );
    }

}
