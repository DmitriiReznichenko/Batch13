package loops;

public class WhileLoops7 {
    public static void main(String[] args) {
        int balance=40;
        int cost=5;
        int numberOfCall=0;


while (balance>=cost){
    System.out.println("This is  your call # "+ ++numberOfCall + " . Remaining balance is $ "+(balance=balance-cost));
}



    }
}
