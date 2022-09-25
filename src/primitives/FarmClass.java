package primitives;

public class FarmClass {

    public static void main(String[] args) {
        int cows=15;
        int chikens=40;
        System.out.println("There are total of " + ((cows*4)+(chikens*2))+  " legs in this farm");



        double cowCost=1200, chickenCost=11.99;

        System.out.println("the worth of the farm is $"+ ((chickenCost*chikens)+(cowCost*cows)));
    }

}
