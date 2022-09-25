package ifStatement;

public class IfPractice {


    public static void main(String[] args) {
        System.out.println("This is begining of the code");

        //if
        if (3==3){
            System.out.println("This is inside of IF Block");
        }
        if (3==5) {
            System.out.println("this is the second  If block");
        }
            System.out.println("This is end of the code");
// You can have multiple if statments in the same class

        int apples=20;
        int oranges=40;
        //PRInt out 'hi' when there are more numbers of apples than oranges
        //PRInt out 'bye' when there  is the same amount of apples and oranges


        if (apples>oranges){
            System.out.println("Hi");

        }
        if ( apples==oranges){
           System.out.println("bye");
}
        int appleCost=2, orangecost=3, wallet=160;
        if ((orangecost*oranges+appleCost*apples)<=wallet){

            System.out.println("i can Bye fruits");
        }


    }
}
