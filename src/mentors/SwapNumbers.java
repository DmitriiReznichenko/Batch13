package mentors;

public class SwapNumbers {
    public static void main(String[] args) {

        float first=1.20f, second= 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = "+ first);
        System.out.println("Second number= "+ second);

        // value of first is assigned to temporary

        float temp= first;  // 1.20

        // value of second is assigned to first

        first=second; // 2.45

        // value of temporary (which contains the inital value of first)

        second= temp; //1.20


        // display

        System.out.println("--After swap--");
        System.out.println("First number = "+ first);
        System.out.println("Second number = "+ second);


    }
    }
