package loops;

public class NestesForLoopCloock {
    public static void main(String[] args) {
        HOURS:
        for ( int hour=1; hour<=11; hour++){
            MNUTES:
            for (int minute=0; minute<=59; minute++){
                if (minute==25)
                    break HOURS;
                SECONDS:
                for (int secind=0; secind<=59;secind++) {

                    System.out.println(hour + " : " + minute + " : " + secind);
                }
            }
        }
    }
}
